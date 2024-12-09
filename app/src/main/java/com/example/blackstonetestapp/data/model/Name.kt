package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Name(
    @Json(name = "family")
    val familyObj: String?,
    @Json(name = "_family")
    val family: Family?,
    @Json(name = "given")
    val given: List<String>
)