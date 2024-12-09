package com.example.blackstonetestapp.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.blackstonetestapp.RetrofitClient.patientApiService
import com.example.blackstonetestapp.data.model.Patient

class PatientViewModel : ViewModel() {
    private val _patient = MutableLiveData<Patient>()
    val patient: LiveData<Patient> get() = _patient

    suspend fun getData(): Boolean {
        var successfulResponse = false
        try {
            val response = patientApiService.getItems()
            if (response.isSuccessful) {
                successfulResponse = true
                _patient.value = response.body()
                Log.d("ben!", "response IS successful")
            }else{
                Log.d("ben!", "response NOT successful")
                successfulResponse = false
                val errorBody = response.errorBody()?.string()
                Log.d("ben!", "HTTP error: ${response.code()} - $errorBody")
            }
        } catch (e: Exception) {
            Log.d("ben!", "First Exception: ${e.message}")
        } catch (e: Exception) {
            Log.d("ben!", "Second Exception: ${e.message}")

        }
        return successfulResponse;
    }

}