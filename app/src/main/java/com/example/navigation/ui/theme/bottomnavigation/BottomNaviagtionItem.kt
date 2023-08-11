package com.example.navigation.ui.theme.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNaviagtionItem(
    val name: String,
    val route: String,
    val icon: ImageVector
)

val bottomNaviagtionItems = listOf(
    BottomNaviagtionItem(
        name = "Settings",
        route = "settings",
        icon = Icons.Default.Settings
    ),
    BottomNaviagtionItem(
        name = "Home",
        route = "home",
        icon = Icons.Default.Home
    ),
    BottomNaviagtionItem(
        name = "Profile",
        route = "profile",
        icon = Icons.Default.Person
    ),

)