package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdditionalAddres(
    @Json(name = "city")
    val city: String,
    @Json(name = "line")
    val line: List<String>,
    @Json(name = "postalCode")
    val postalCode: String,
    @Json(name = "state")
    val state: String,
    @Json(name = "use")
    val use: String
)