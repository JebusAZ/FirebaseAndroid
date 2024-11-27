package com.alzati.firebaseandroid.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alzati.firebaseandroid.home.Home
import com.alzati.firebaseandroid.screens.SplashScreen
import com.alzati.firebaseandroid.screens.login.LoginScreen

@Composable

fun Navigation(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.name
    ){
        composable(Screens.SplashScreen.name
        ){
            SplashScreen(navController = navController)
        }
        composable(Screens.LoginScreen.name
        ){
            LoginScreen(navController = navController)
        }
        composable(Screens.Homescreen.name
        ){
            Home(navController = navController)
        }
    }
}