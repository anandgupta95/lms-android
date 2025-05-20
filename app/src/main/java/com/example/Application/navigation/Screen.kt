package com.example.Application.navigation

sealed class Screen(val route: String) {
    object CourseList : Screen("course_list")
    object CourseDetail : Screen("course_detail/{courseId}") {
        fun createRoute(courseId: Int): String = "course_detail/$courseId"
    }
    object Login : Screen("login")
}
