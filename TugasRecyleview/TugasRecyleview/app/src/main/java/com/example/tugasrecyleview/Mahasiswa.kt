package com.example.tugasrecyleviewfarrel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Mahasiswa(
    val name: String?,
    val nim: String?
) : Parcelable