package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdditionalName(
    @Json(name = "given")
    val given: List<String>,
    @Json(name = "use")
    val use: String
)