package com.alzati.firebaseandroid.screens

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.alzati.firebaseandroid.navigation.Screens
import com.alzati.firebaseandroid.screens.login.LoginScreen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen (navController: NavController){
    LaunchedEffect(key1 = true) { 
        delay(3000L)
        navController.navigate(Screens.LoginScreen.name)
    }
    Text(text ="Splash Screen")
}