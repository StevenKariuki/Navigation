package com.example.navigation.ui.theme.screens

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.theme.navigationdrawer.NavigationDrawerLayout

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(navController: NavHostController) {

    val homeNavController = rememberNavController()
    val backStackEntry = homeNavController.currentBackStackEntryAsState()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            NavigationDrawerLayout()
        },
        content = {
            HomeScreen(backStackEntry, homeNavController,drawerState)
        }
    )

}