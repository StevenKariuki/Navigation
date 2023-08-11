package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.theme.NavigationTheme
import com.example.navigation.ui.theme.screens.DetailsPageScreen
import com.example.navigation.ui.theme.screens.StartScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val navController = rememberNavController()

            NavigationTheme {
                NavHost(navController = navController, startDestination = "start") {
                    composable(route = "start") {
                        StartScreen(navController)
                    }

                    composable(
                        route = "detailspage/{randomInteger}",
                    ) { backStackEntry ->
                        val randomInteger = backStackEntry.arguments?.getString("randomInteger")
                        DetailsPageScreen(navController, randomInteger)
                    }
                }
            }
        }
    }

}






