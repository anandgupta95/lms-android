package com.example.Application.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.navigation.NavController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(true) {
        delay(2000)
        navController.navigate("login") {
            popUpTo("splash") { inclusive = true }
        }
    }

    Text("Splash Screen")
}
