package com.example.vk6.ui.Screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ScaffoldApp() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { MainScreen(navController) }
        composable("info") { InfoScreen(navController) }
        composable("settings") { SettingsScreen(navController) }
    }
}
