package com.example.homework.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity (tableName = "car_table" )
data class Car (
    @ColumnInfo (name = "car_brand")
    val brand: String,
    @ColumnInfo (name = "car_price")
    val price : Int,
    @ColumnInfo (name  = "car_color")
    val color : String
        ){
    @PrimaryKey (autoGenerate = true)
    var id : Int? = null
}