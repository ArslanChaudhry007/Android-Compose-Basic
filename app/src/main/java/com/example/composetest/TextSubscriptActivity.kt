package com.example.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import com.example.composetest.ui.theme.ComposeTestTheme

class TextSubscriptActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        TextSuperScript(
                            normalText = "Hello",
                            superText = "Subscript!",
                            fontWeight = FontWeight.Normal,
                            lineShift = BaselineShift.Subscript
                        )
                        TextSuperScript(
                            normalText = "Hello",
                            superText = "SuperScript!",
                            fontWeight = FontWeight.ExtraBold,
                            lineShift = BaselineShift.Superscript
                        )
                    }

                }
            }
        }
    }
}

@Composable
fun TextSuperScript(
    normalText: String,
    superText: String,
    normalFontSize: TextUnit = MaterialTheme.typography.subtitle1.fontSize,
    superFontSize: TextUnit = MaterialTheme.typography.overline.fontSize,
    fontWeight: FontWeight = FontWeight.Normal,
    lineShift: BaselineShift = BaselineShift.Subscript
) {
    Text(buildAnnotatedString {
        withStyle(
            style = SpanStyle(
                fontSize = normalFontSize,
                fontWeight = fontWeight
            )
        ) {
            append(normalText)
        }

        withStyle(
            style = SpanStyle(
                fontSize = superFontSize,
                fontWeight = fontWeight,
                baselineShift = lineShift
            )
        ) {
            append(superText)
        }
    })
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    ComposeTestTheme {
        Column(modifier = Modifier.fillMaxSize()) {
            TextSuperScript(
                normalText = "Hello",
                superText = "Subscript!",
                fontWeight = FontWeight.Normal,
                lineShift = BaselineShift.Subscript
            )
            TextSuperScript(
                normalText = "Hello",
                superText = "SuperScript!",
                fontWeight = FontWeight.ExtraBold,
                lineShift = BaselineShift.Superscript
            )
        }
    }
}