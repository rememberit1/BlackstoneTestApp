package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TelecomX(
    @Json(name = "period")
    val period: PeriodXXXX?,
    @Json(name = "rank")
    val rank: Int?,
    @Json(name = "system")
    val system: String?,
    @Json(name = "use")
    val use: String,
    @Json(name = "value")
    val value: String?
)