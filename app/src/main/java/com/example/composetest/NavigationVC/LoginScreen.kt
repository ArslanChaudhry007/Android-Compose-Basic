package com.example.composetest.NavigationVC

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun LoginScreen(navHostController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.clickable {
                navHostController.popBackStack()
                navHostController.navigate(route = Screen.Home.route)
            },
            text = "Login and Go To HomeScreen",
            color = Color.Magenta,
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Bold
        )
        /*    Text(
                modifier = Modifier
                    .padding(top = 150.dp)
                    .clickable {
                        navHostController.popBackStack()
                        navHostController.navigate(Screen.Detail.passNameAndId())
                    },
                text = "Open Detail Screen",
                fontSize = MaterialTheme.typography.h6.fontSize,
                fontWeight = FontWeight.Medium
            )*/
    }
}

@Composable
@Preview(showBackground = true)
fun LoginSCreenPreview() {
    LoginScreen(navHostController = rememberNavController())
}
