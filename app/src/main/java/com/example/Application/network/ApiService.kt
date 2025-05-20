
package com.example.Application.network

import com.example.Application.model.CourseResponse
import retrofit2.http.GET

interface ApiService {
    @GET("course",) // Replace with your actual endpoint
    suspend fun getCourses(): CourseResponse
}
