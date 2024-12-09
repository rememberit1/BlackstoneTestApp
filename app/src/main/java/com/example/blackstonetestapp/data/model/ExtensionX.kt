package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ExtensionX(
    @Json(name = "url")
    val url: String,
    @Json(name = "valueString")
    val valueString: String
)