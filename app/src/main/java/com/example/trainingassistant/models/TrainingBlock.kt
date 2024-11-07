package com.example.trainingassistant.models

data class TrainingBlock(
    val name: String,
    val duration: Int, // czas w minutach
    val exercises: List<Exercise> = listOf() // lista ćwiczeń w bloku
)
