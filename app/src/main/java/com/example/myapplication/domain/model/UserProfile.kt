package com.example.myapplication.domain.model

data class UserProfile(
    val name: String,
    val registration: String,
    val email: String,
    val phone: String
)

data class DietaryPreference(
    val name: String,
    val isSelected: Boolean
)

