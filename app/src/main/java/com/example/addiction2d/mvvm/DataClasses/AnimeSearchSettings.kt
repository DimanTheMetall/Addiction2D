package com.example.addiction2d.mvvm.DataClasses

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnimeSearchSettings(
    var searchedText: String?,
    val type: String?,
    val maxScore: Int?,
    val minScore: Int?,
    val status: String?,
    val rating: String?,
    val sfw: Boolean?,
    val genresInclude: String?,
    val genresExclude: String?
):Parcelable

