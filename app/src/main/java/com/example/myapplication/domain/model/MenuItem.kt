package com.example.myapplication.domain.model

import androidx.compose.ui.graphics.Color

data class MenuItem(
    val name: String,
    val description: String,
    val dividerColor: Color = Color(0xFFCAC9C9)
)

