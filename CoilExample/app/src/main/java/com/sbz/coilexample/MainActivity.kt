package com.sbz.coilexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import coil.transform.RoundedCornersTransformation
import com.sbz.coilexample.ui.theme.CoilExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoilExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CoilImage()
                }
            }
        }
    }
}

@OptIn(ExperimentalCoilApi::class)
@Composable
fun CoilImage() {
    Box(
        modifier = Modifier
            .width(150.dp)
            .height(150.dp),
        contentAlignment = Alignment.Center
    ) {
        val painter = rememberImagePainter(
            data = "https://4kwallpapers.com/images/walls/thumbs_3t/6484.jpg",
            builder = {
                placeholder(R.drawable.baseline_image_24)
                error(R.drawable.ic_error)
                crossfade(2000)
                transformations(
                    GrayscaleTransformation(),
//                    CircleCropTransformation(),
                    BlurTransformation(LocalContext.current),
                    RoundedCornersTransformation(50f)
                )
            }
        )
        val painterState = painter.state
        Image(painter = painter, contentDescription = "Logo Image")
//        if(painterState is ImagePainter.State.Loading){
//            CircularProgressIndicator()
//        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoilExampleTheme {
        CoilImage()
    }
}