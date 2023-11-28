package com.example.splashanimation.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.splashanimation.HomeScreen
import com.example.splashanimation.SplashScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash_screen"){

        composable("splash_screen"){
        SplashScreen(navController = navController)
        }

        composable("main_screen"){
         HomeScreen(navController = navController)
        }
    }
}