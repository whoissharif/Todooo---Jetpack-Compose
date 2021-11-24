package com.whoissharif.firstjcproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.whoissharif.firstjcproject.ui.theme.FirstJCProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstJCProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ScreenMain()
                }
            }
        }
    }
}

@Composable
fun ScreenMain() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Home.route) {

        // First route : Home
        composable(Routes.Home.route) {

            // Lay down the Home Composable
            // and pass the navController
            HomeActivity(
                navController = navController
            )
        }

        // Another Route : Detail
        composable(Routes.Details.route) {
            // Profile Screen
            TodoDetailsActivity()
        }

        composable(Routes.AddTodo.route) {
            // Profile Screen
            AddTodoActivity()
        }

        // Settings Route, Notice the "/{id}" in last,
        // its the argument passed down from homeScreen
//        composable(Routes.Settings.route + "/{id}") { navBackStack ->
//
//            // Extracting the argument
//            val counter = navBackStack.arguments?.getString("id")
//
//            // Setting screen,
//            // Pass the extracted Counter
//            Setting(counter = counter)
//        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FirstJCProjectTheme {
        Greeting("Android")
    }
}