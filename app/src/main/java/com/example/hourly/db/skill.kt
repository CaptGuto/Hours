package com.example.hourly.db

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "skill_data")
data class skill(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var name : String,
    var currentTime: Double,
    var GoalDate: Int,
    var Done: Boolean
)
