package com.whoissharif.firstjcproject

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable

@Composable
fun AddTodoActivity() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Add new Todo")
                },

                )
        }


    ) {
        Column() {
            Text("fdsffsdfsa")
        }
    }
}