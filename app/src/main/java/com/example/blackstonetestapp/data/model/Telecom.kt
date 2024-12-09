package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Telecom(
    @Json(name = "system")
    val system: String,
    @Json(name = "value")
    val value: String
)