package com.example.composetest.NavigationVC


const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"
const val ROOT_GRAPH_ROUTE = "root"
const val SELECTION_GRAPH_ROUTE = "selection_root"
const val AUTH_GRAPH_ROUTE = "auth"
const val HOME_GRAPH_ROUTE = "home"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")


    //Optional Parameter
    object Detail : Screen(route = "detail_screen?id={id}&name={name}") {
        fun passNameAndId(
            id: Int = 0,
            name: String = "Stevdza-San"
        ): String {
            return "detail_screen?id=$id&name=$name"
        }
    }

    // Required Parameter
 /*   object Detail : Screen(route = "detail_screen/{$DETAIL_ARGUMENT_KEY}/{$DETAIL_ARGUMENT_KEY2}") {
         fun passId(id: Int): String {
             return this.route.replace(oldValue = "{$DETAIL_ARGUMENT_KEY}", newValue = id.toString())
         }
         fun passNameAndId(id: Int, name: String): String {
             return "detail_screen/$id/$name"
         }
    }*/
    object SelctionScreen: Screen(route = "selection_screen")
    object Login: Screen(route = "login_screen")
    object SignUp: Screen(route = "sign_up_screen")
}
