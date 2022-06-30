package com.example.addiction2d.mvvm.People

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.addiction2d.databinding.FragmentPeopleStartBinding
import com.example.addiction2d.mvvm.BaseFragment

class PeopleStartFragment : BaseFragment<FragmentPeopleStartBinding>() {

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPeopleStartBinding {
        return FragmentPeopleStartBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}