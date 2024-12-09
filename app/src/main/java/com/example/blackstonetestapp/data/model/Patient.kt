package com.example.blackstonetestapp.data.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Patient(
    @Json(name = "active")
    val active: Boolean,
    @Json(name = "address")
    val address: List<Addres>,
    @Json(name = "birthDate")
    val birthDate: String,
    @Json(name = "_birthDate")
    val birthDateObj: BirthDate,
    @Json(name = "contact")
    val contact: List<Contact>,
    @Json(name = "deceasedBoolean")
    val deceasedBoolean: Boolean,
    @Json(name = "gender")
    val gender: String,
    @Json(name = "id")
    val id: String,
    @Json(name = "identifier")
    val identifier: List<Identifier>,
    @Json(name = "managingOrganization")
    val managingOrganization: ManagingOrganization,
    @Json(name = "name")
    val name: List<NameX>,
    @Json(name = "resourceType")
    val resourceType: String,
    @Json(name = "telecom")
    val telecom: List<TelecomX>
)