package com.example.addiction2d.mvvm.Manga

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.addiction2d.databinding.FragmentMangaStartBinding
import com.example.addiction2d.mvvm.BaseFragment


class MangaStartFragment : BaseFragment<FragmentMangaStartBinding>() {

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentMangaStartBinding {
        return FragmentMangaStartBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}