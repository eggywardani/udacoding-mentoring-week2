package com.eggy.mytask2.recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    var name:String,
    var images:Int,
    var genre:String
) : Parcelable