// navigation/NavGraph.kt
package com.example.Application.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.Application.ui.screens.CourseDetailScreen
import com.example.Application.ui.screens.HomeScreen
import com.example.Application.ui.screens.LoginScreen
import com.example.Application.ui.screens.SplashScreen
import com.example.Application.ui.screens.common.ProfileScreen
import com.example.Application.ui.screens.common.RegisterScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("login") { LoginScreen(navController) }
        composable("register") { RegisterScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("course_detail") { CourseDetailScreen(navController) }
        composable("profile") { ProfileScreen(navController) }

    }
}
