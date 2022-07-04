package com.example.addiction2d.mvvm.Anime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.addiction2d.R
import com.example.addiction2d.databinding.FragmentAnimeStartBinding
import com.example.addiction2d.mvvm.BaseFragment


class AnimeStartFragment : BaseFragment<FragmentAnimeStartBinding>() {



    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentAnimeStartBinding {
        return FragmentAnimeStartBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnSearchClickListener()
    }

    private fun setOnSearchClickListener(){
        binding.searchAnimeCard.setOnClickListener {
            findNavController().navigate(R.id.action_animeStartFragment_to_animeSearchFragment)
        }
    }



    private fun setOnFavoriteClickListener(){
        TODO()
        
    }

    private fun setOnRandomClickListener(){
        TODO()
    }


}