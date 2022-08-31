package com.example.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetest.ui.theme.ComposeTestTheme

class TextCustomization : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        TextCustomization1()
                        TextCustomization2()
                        TextCustomization3()
                    }
                }
            }
        }
    }
}


    @Composable
    fun TextCustomization1() {

        Text(
            text = stringResource(id = R.string.app_name), modifier = Modifier
                .background(MaterialTheme.colors.primary)
                .padding(16.dp)
                .width(150.dp),
            color = Color.White,
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start
        )
    }


    @Composable
    fun TextCustomization2() {
        Text(buildAnnotatedString {
            withStyle(style = ParagraphStyle(textAlign = TextAlign.Center)) {
                withStyle(
                    style = SpanStyle(
                        color = MaterialTheme.colors.primary,
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp

                    )
                ) {
                    append("A")
                }
                append("B")
                append("C")
                append("D")
            }

        }, modifier = Modifier.width(200.dp))
    }

    @Composable
    fun TextCustomization3() {
        Text(text = "Text Repetition".repeat(20), maxLines = 2, overflow = TextOverflow.Ellipsis)
    }


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview4() {
        ComposeTestTheme {
            Column(modifier = Modifier.fillMaxSize()) {
                TextCustomization1()
                TextCustomization2()
                TextCustomization3()
            }


        }
    }
