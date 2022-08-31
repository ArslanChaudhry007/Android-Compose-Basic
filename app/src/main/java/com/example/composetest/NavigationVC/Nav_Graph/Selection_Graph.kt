package com.example.composetest.NavigationVC.Nav_Graph

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.composetest.NavigationVC.*

fun NavGraphBuilder.selectionNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.SelctionScreen.route,
        route = SELECTION_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.SelctionScreen.route
        ) {
            LoginAndSignUpSelection(navController)
        }
    }
}