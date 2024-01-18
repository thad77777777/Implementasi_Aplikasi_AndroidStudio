package com.example.muhammadfarrelardan_32602100006

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Mahasiswa (
    val name: String?,
    val nim: String?
) : Parcelable