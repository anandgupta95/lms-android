package com.example.Application.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.Application.model.Course
import com.example.Application.network.RetrofitInstance
import kotlinx.coroutines.launch
import androidx.compose.runtime.*

class CourseViewModel : ViewModel() {

    var courseList by mutableStateOf<List<Course>>(emptyList())
        private set

    var isLoading by mutableStateOf(true)
        private set

    var errorMessage by mutableStateOf<String?>(null)
        private set

    init {
        fetchCourses()
    }

    private fun fetchCourses() {
        viewModelScope.launch {
            isLoading = true
            errorMessage = null
            try {
                val courseResponse = RetrofitInstance.api.getCourses()
                courseList = courseResponse.data
            } catch (e: Exception) {
                errorMessage = e.localizedMessage ?: "An unexpected error occurred"
            }
            isLoading = false
        }
    }

}

