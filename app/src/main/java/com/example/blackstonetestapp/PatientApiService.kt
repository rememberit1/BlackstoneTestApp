package com.example.blackstonetestapp

import com.example.blackstonetestapp.data.model.Patient
import retrofit2.Response
import retrofit2.http.GET

interface PatientApiService {
    @GET("patient-example.json")
    suspend fun getItems(): Response<Patient>
}