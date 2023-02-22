package com.sbz.gradientbutton

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.sbz.gradientbutton.ui.theme.GradientButtonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GradientButtonTheme {
                // A surface container using the 'background' color from the theme
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    GradientButton(
                        text = "Shabaj Button",
                        textColor = Color.Black,
                        gradient = Brush.horizontalGradient(listOf(Color.Green, Color.Magenta)),
                        onClick = ({Toast.makeText(
                            this@MainActivity,
                            "Button is Clicked",
                            Toast.LENGTH_LONG
                        ).show()})
                    )
                }
            }
        }
    }
}

