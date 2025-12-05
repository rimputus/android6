package com.example.vk6.ui.Screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.vk6.ui.Components.MainTopAppBar

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        topBar = { MainTopAppBar("My App", navController) }
    ) { innerPadding ->
        Text(
            text = "Home Screen",
            modifier = Modifier.padding(innerPadding)
        )
    }
}
