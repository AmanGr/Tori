package com.github.amangr.kotlinmessanger.models


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
//user
@Parcelize
class User(val uid: String, val username: String, val profileImageUri: String): Parcelable {
    constructor() : this("","","")

}