package com.example.vk6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.vk6.ui.Screens.ScaffoldApp
import com.example.vk6.ui.theme.Vk6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Vk6Theme {
                ScaffoldApp()
            }
        }
    }
}
