package com.example.composetest.NavigationVC.Nav_Graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.composetest.NavigationVC.AUTH_GRAPH_ROUTE
import com.example.composetest.NavigationVC.LoginScreen
import com.example.composetest.NavigationVC.Screen
import com.example.composetest.NavigationVC.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Login.route,
        route = AUTH_GRAPH_ROUTE
    ){
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen( navController)
        }
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController)
        }
    }
}