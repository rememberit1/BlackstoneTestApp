package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Address(
    @Json(name = "city")
    val city: String,
    @Json(name = "district")
    val district: String,
    @Json(name = "line")
    val line: List<String>,
    @Json(name = "period")
    val period: com.example.blackstonetestapp.data.model.Period,
    @Json(name = "postalCode")
    val postalCode: String,
    @Json(name = "state")
    val state: String,
    @Json(name = "type")
    val type: String,
    @Json(name = "use")
    val use: String
)