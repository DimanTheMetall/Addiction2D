package com.example.addiction2d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.addiction2d.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpNavControllerWithBottomNav()
        setUpFragmentListener()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }



    private fun setUpNavControllerWithBottomNav() {
        val navHostFragment = getNavHost()
        val navController = navHostFragment.navController

        binding.btmNavView.setupWithNavController(navController)
    }

    private fun setUpFragmentListener() {

        fun setBottomNavBackgroundResource(drawableId: Int) {
            binding.btmNavView.setBackgroundResource(drawableId)
            binding.btmNavView.visibility = View.VISIBLE
        }
        val listener = NavController.OnDestinationChangedListener { _, destination, _ ->
            when(destination.id){
                R.id.animeStartFragment -> setBottomNavBackgroundResource(R.drawable.bottm_nav_anime)
                R.id.mangaStartFragment -> setBottomNavBackgroundResource(R.drawable.bottm_nav_manga)
                R.id.peopleStartFragment -> setBottomNavBackgroundResource(R.drawable.bottm_nav_people)
                R.id.charStartFragment -> setBottomNavBackgroundResource(R.drawable.bottm_nav_char)
                else -> binding.btmNavView.visibility = View.GONE
            }
        }

        val navHostFragment = getNavHost()
        navHostFragment.navController.addOnDestinationChangedListener(listener)
    }

    private fun getNavHost(): NavHostFragment {
        return requireNotNull(supportFragmentManager.findFragmentById(R.id.activity_fragment_container) as? NavHostFragment)
    }


}