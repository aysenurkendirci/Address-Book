package com.example.kisileruygulamasi.data.entity

import com.google.gson.annotations.SerializedName

data class KisilerCevap(
    @SerializedName("kisiler") val kisiler: List<Kisiler>,
    @SerializedName("success") val success: Int
)
