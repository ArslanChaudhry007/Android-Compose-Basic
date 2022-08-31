package com.example.composetest

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.GrayscaleTransformation
import com.example.composetest.GradientButtonVC.GradientButton
import com.example.composetest.LazyColumnVC.CustomItem
import com.example.composetest.LazyColumnVC.PersonRepository
import com.example.composetest.NavigationVC.SetupNavGraph
import com.example.composetest.googleButtonVC.GoogleButton
import com.example.composetest.ui.theme.ComposeTestTheme
import com.example.composetest.ui.theme.color1
import com.example.composetest.ui.theme.color2


class MainActivity : ComponentActivity() {
  lateinit var navHostController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                navHostController = rememberNavController()
                SetupNavGraph(navController = navHostController)
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview12() {
    ComposeTestTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {

        }
    }
}