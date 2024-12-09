package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Contact(
    @Json(name = "additionalAddress")
    val additionalAddress: List<com.example.blackstonetestapp.data.model.AdditionalAddres>,
    @Json(name = "additionalName")
    val additionalName: List<com.example.blackstonetestapp.data.model.AdditionalName>,
    @Json(name = "address")
    val address: com.example.blackstonetestapp.data.model.Address,
    @Json(name = "gender")
    val gender: String,
    @Json(name = "name")
    val name: com.example.blackstonetestapp.data.model.Name,
    @Json(name = "period")
    val period: com.example.blackstonetestapp.data.model.Period,
    @Json(name = "relationship")
    val relationship: List<com.example.blackstonetestapp.data.model.Relationship>,
    @Json(name = "telecom")
    val telecom: List<com.example.blackstonetestapp.data.model.Telecom>
)