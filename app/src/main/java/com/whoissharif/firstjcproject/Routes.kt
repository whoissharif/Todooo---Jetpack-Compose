package com.whoissharif.firstjcproject

sealed class Routes(val route: String) {
    object Home : Routes("home")
    object Details : Routes("details")
    object Settings : Routes("setting")
    object AddTodo : Routes("addTodo")
}