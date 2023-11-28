package com.example.splashanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.splashanimation.Navigation.Navigation
import com.example.splashanimation.ui.theme.SplashAnimationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashAnimationTheme {

                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {

                Navigation()


                }
            }
        }
    }
}




//@Preview(showBackground = true)
