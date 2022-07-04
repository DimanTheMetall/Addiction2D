package com.example.addiction2d.mvvm.AnimeSearch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.example.addiction2d.Constanse
import com.example.addiction2d.R
import com.example.addiction2d.databinding.FragmentAnimeSearchBinding
import com.example.addiction2d.mvvm.BaseFragment
import com.example.addiction2d.mvvm.DataClasses.AnimeSearchSettings
import java.lang.NullPointerException

class AnimeSearchFragment : BaseFragment<FragmentAnimeSearchBinding>() {

    private var animeSearchSettings =
        AnimeSearchSettings(
            searchedText = null,
            type = null,
            maxScore = null,
            minScore = null,
            status = null,
            rating = null,
            sfw = null,
            genresInclude = null,
            genresExclude = null
        )

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentAnimeSearchBinding {
        return FragmentAnimeSearchBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnSettingsClickListener()
        setResultListener()
    }

    private fun setResultListener() {
        setFragmentResultListener(Constanse.REQUEST_ANIME_SETTINGS_KEY) { requestKey: String, bundle: Bundle ->
            if (requestKey == Constanse.REQUEST_ANIME_SETTINGS_KEY) {
                Toast.makeText(requireContext(), "Ti cho ahuel", Toast.LENGTH_SHORT).show()
                val settings =
                    bundle.getParcelable<AnimeSearchSettings>(Constanse.BUNDLE_ANIME_SETTINGS_KEY)
                        ?: throw NullPointerException("Anime search settings is null")

                animeSearchSettings = animeSearchSettings.copy(
                    type = settings.type,
                    maxScore = settings.maxScore,
                    minScore = settings.minScore,
                    status = settings.status,
                    rating = settings.rating,
                    sfw = settings.sfw,
                    genresInclude = settings.genresInclude,
                    genresExclude = settings.genresExclude
                )
            }
        }
    }

    private fun setOnSettingsClickListener() {
        binding.searchSettingsImageView.setOnClickListener {
            findNavController().navigate(R.id.action_animeSearchFragment_to_animeSearchSettingsFragment)
        }
    }

}