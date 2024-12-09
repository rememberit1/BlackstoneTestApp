package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Family(
    @Json(name = "extension")
    val extension: List<ExtensionX>
)