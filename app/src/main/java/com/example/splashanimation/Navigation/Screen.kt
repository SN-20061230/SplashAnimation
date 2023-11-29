package com.example.splashanimation.Navigation

sealed class Screens(val route: String) {
    object HomeScreen : Screens("home_screen")
    object SplashScreen : Screens("splash_screen")


}