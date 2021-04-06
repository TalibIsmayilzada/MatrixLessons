package com.talib.matrix

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(val name: String,
                val surname: String,
                val age: Int,
                val phoneNUmber: String? = null): Parcelable