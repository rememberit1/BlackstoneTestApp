package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Identifier(
    @Json(name = "assigner")
    val assigner: com.example.blackstonetestapp.data.model.Assigner,
    @Json(name = "period")
    val period: com.example.blackstonetestapp.data.model.Period,
    @Json(name = "system")
    val system: String,
    @Json(name = "type")
    val type: com.example.blackstonetestapp.data.model.Type,
    @Json(name = "use")
    val use: String,
    @Json(name = "value")
    val value: String
)