package com.example.addiction2d.mvvm.Anime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

    }


}