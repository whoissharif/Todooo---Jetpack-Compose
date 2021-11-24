package com.whoissharif.firstjcproject

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable

@Composable
fun TodoDetailsActivity() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Details")
                },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(Icons.Filled.Settings, contentDescription = null)
                    }
                }
            )
        }


    ) {
        Column() {
            Text("Details")
        }
    }
}