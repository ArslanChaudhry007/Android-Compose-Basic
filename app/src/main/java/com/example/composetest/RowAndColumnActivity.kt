package com.example.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetest.ui.theme.ComposeTestTheme

class RowAndColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    /*Column(
                        modifier = Modifier.height(500.dp).width(500.dp).background(Color.LightGray),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
                        CustomItem(weight = 1f)
                    }*/

                    Row(
                        modifier = Modifier.height(500.dp).width(500.dp).background(Color.LightGray),
                       horizontalArrangement = Arrangement.Start
                    ) {
                        CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
                        CustomItem(weight = 1f)
                    }
                }
            }
        }
    }
}

@Composable
fun RowScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.primary) {
    Surface(
        modifier = Modifier
            .height(50.dp).width(50.dp).weight(weight),

        color = color
    ) {}
}

@Composable
fun ColumnScope.CustomItem(weight: Float, color: Color = MaterialTheme.colors.primary) {
    Surface(
        modifier = Modifier
            .width(100.dp)
            .weight(weight),
        color = color
    ) {}
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestTheme {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Start
        ) {
            CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
            CustomItem(weight = 1f)
        }

    }
}