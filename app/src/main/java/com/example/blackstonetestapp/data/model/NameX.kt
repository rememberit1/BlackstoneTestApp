package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NameX(
    @Json(name = "family")
    val family: String?,
    @Json(name = "given")
    val given: List<String>,
    @Json(name = "period")
    val period: PeriodXXXX?,
    @Json(name = "use")
    val use: String
)