package com.example.addiction2d.mvvm.Root

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.addiction2d.R
import com.example.addiction2d.databinding.RootFragmentBinding
import com.example.addiction2d.mvvm.BaseFragment

class RootFragment : BaseFragment<RootFragmentBinding>() {

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): RootFragmentBinding {
        return RootFragmentBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navHost = childFragmentManager.findFragmentById(R.id.fragment_container_view_root) as NavHostFragment
        val navController = navHost.navController
        NavigationUI.setupWithNavController(binding.btmNavView,navController)
    }


}