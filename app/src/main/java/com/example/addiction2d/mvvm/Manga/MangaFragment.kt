package com.example.addiction2d.mvvm.Manga

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.addiction2d.databinding.FragmentMangaBinding
import com.example.addiction2d.mvvm.BaseFragment


class MangaFragment : BaseFragment<FragmentMangaBinding>() {

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentMangaBinding {
        return FragmentMangaBinding.inflate(inflater, container, false)
    }


}