package com.example.splashanimation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController){
    Box(

        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ){

        Text(text = "HomeScreen")
    }
}