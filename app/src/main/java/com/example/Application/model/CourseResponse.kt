
package com.example.Application.model
data class CourseResponse(
    val status: String,
    val message: String,
    val data: List<Course>
)

data class Course(
    val id: Int,
    val title: String,
    val description: String,
    val url: String,
    val price: Double,
    val subject: String,
    val batch: String,
    val taughtBy: String?, // Nullable
    val noOfEnrolled: Int
)
