package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Coding(
    @Json(name = "code")
    val code: String,
    @Json(name = "system")
    val system: String
)