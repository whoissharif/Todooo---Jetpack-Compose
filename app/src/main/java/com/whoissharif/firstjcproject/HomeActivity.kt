package com.whoissharif.firstjcproject

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

val myData = listOf(
    "Switching to jetpack compose",
    "Code in kotlin",
    "Implement composable widgets",
    "Create a new git repository",
    "Push the project to github",
)


@Composable
fun HomeActivity(navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Todoooo")
                },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Settings, contentDescription = null)
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navController.navigate(Routes.AddTodo.route)
            }) {
                Icon(Icons.Filled.Add, contentDescription = null)
            }
        }


    )
    { innerPadding ->
        LazyColumn {

            itemsIndexed(myData) { index, item ->
                Card(

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp)
                        .clickable(enabled = true) {
                            navController.navigate(Routes.Details.route)
                        },
                    elevation = 10.dp
                ) {
                    Row(Modifier.padding(15.dp), verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            Modifier
                                .size(size = 50.dp)
                                .clip(shape = CircleShape)
                                .background(Color.Cyan),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("${index + 1}");
                        }


                        Text(
                            text = item,
                            Modifier
                                .padding(horizontal = 10.dp)
                                .width(200.dp)
                        )
                        Spacer(Modifier.weight(1f))
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(Icons.Filled.ArrowForward, contentDescription = null)
                        }
                    }
                }
            }
        }
    }
}