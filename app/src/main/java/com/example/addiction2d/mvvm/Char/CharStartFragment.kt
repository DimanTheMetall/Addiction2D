package com.example.addiction2d.mvvm.Char

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.addiction2d.databinding.FragmentCharStartBinding
import com.example.addiction2d.mvvm.BaseFragment

class CharStartFragment : BaseFragment<FragmentCharStartBinding>() {

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentCharStartBinding {
        return FragmentCharStartBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}