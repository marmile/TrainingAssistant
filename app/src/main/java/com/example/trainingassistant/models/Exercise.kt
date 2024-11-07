package com.example.trainingassistant.models

data class Exercise(
    val name: String,
    val repetitions: Int,
    val duration: Int?, // czas w sekundach, opcjonalnie
    val description: String = "",
    val images: List<String> = listOf() // opcjonalne zdjęcia
)
