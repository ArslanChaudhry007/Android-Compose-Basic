package com.example.composetest.NavigationVC

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.composetest.NavigationVC.Nav_Graph.authNavGraph
import com.example.composetest.NavigationVC.Nav_Graph.homeNavGraph
import com.example.composetest.NavigationVC.Nav_Graph.selectionNavGraph

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = SELECTION_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ) {
        selectionNavGraph(navController = navController)
        authNavGraph(navController = navController)
        homeNavGraph(navController = navController)

    }
}