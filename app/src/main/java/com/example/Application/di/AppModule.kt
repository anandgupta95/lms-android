//package com.example.Application.di
//
//import com.example.Application.network.ApiService
//
//
//object AppModule {
//        private const val BASE_URL = "http://192.168.1.5:8080/" // Your IP
//
//        private val apiService: ApiService by lazy {
//            RetrofitInstance.create(BASE_URL)
//        }
//
//        val courseRepository: CourseRepository by lazy {
//            CourseRepository(apiService)
//        }
//    }
//
