package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Relationship(
    @Json(name = "coding")
    val coding: List<com.example.blackstonetestapp.data.model.Coding>
)