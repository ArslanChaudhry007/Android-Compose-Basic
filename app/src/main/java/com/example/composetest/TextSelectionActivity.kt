package com.example.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composetest.ui.theme.ComposeTestTheme

class TextSelectionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        CustomTextSelection()
                    }

                }
            }
        }
    }
}

@Composable
fun CustomTextSelection() {
    SelectionContainer() {
        Column() {
            Text(text = "Hello World")
            DisableSelection {
                Text(text = "Hello World")
            }
            Text(text = "Hello World")
        }

    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    ComposeTestTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            CustomTextSelection()
        }
    }
}