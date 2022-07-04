package com.example.addiction2d.mvvm.AnimeSearchSettings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.example.addiction2d.Constanse
import com.example.addiction2d.databinding.FragmentAnimeSearchSettingsBinding
import com.example.addiction2d.mvvm.BaseFragment
import com.example.addiction2d.mvvm.DataClasses.AnimeSearchSettings
import com.example.addiction2d.mvvm.GenresBottomSheetDialog


class AnimeSearchSettingsFragment : BaseFragment<FragmentAnimeSearchSettingsBinding>() {

    private var bottomSheetDialog: GenresBottomSheetDialog? = null

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentAnimeSearchSettingsBinding {
        return FragmentAnimeSearchSettingsBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnApplyClickListener()
        setOnCancelClickListener()
        initBottomSheet()
        setOnIncludeGenresImageViewClickListener()
    }

    private fun setOnIncludeGenresImageViewClickListener(){
        binding.addIncludeGenresImageView.setOnClickListener {
            bottomSheetDialog?.show(childFragmentManager, null)
        }
    }

    private fun initBottomSheet() {
        bottomSheetDialog = GenresBottomSheetDialog()

    }

    private fun setOnApplyClickListener(){
        binding.applyButton.setOnClickListener {
            setFragmentResult(Constanse.REQUEST_ANIME_SETTINGS_KEY, bundleOf(Constanse.BUNDLE_ANIME_SETTINGS_KEY to createSearchSettings()))
            findNavController().popBackStack()
        }
    }

    private fun setOnCancelClickListener(){
        binding.cancelButton.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun createSearchSettings(): AnimeSearchSettings {
        return with(binding){
            AnimeSearchSettings(
                null,
                typeSpinner.selectedItem.toString(),
                maxRatingSpinner.selectedItem.toString().toInt(),
                minRatingSpinner.selectedItem.toString().toInt(),
                statusSpinner.selectedItem.toString(),
                ageRatingSpinner.selectedItem.toString(),
                sfwCheckBox.isChecked,
                includeGenresEditText.text.toString(),
                excludeGenresEditText.text.toString()
            )
        }
    }


}