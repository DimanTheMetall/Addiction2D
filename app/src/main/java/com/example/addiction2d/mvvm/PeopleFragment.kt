package com.example.addiction2d.mvvm

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.addiction2d.databinding.FragmentPeopleBinding


class PeopleFragment : BaseFragment<FragmentPeopleBinding>() {

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPeopleBinding {
        return FragmentPeopleBinding.inflate(inflater, container, false)
    }


}