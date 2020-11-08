package com.eggy.mytask2.listview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Beach(
    var name:String,
    var images:Int,
    var city:String
) : Parcelable