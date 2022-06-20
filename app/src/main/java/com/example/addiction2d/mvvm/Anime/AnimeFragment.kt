package com.example.addiction2d.mvvm.Anime

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.addiction2d.databinding.AnimeFragmentBinding

import com.example.addiction2d.mvvm.BaseFragment

class AnimeFragment : BaseFragment<AnimeFragmentBinding>() {

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): AnimeFragmentBinding {
        return AnimeFragmentBinding.inflate(inflater, container, false)
    }


}