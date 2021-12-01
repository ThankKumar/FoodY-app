package com.ramuday.FoodY.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.ramuday.FoodY.database.RestaurantEntity

/* Dao for accessing the data present inside the DB*/

@Dao
interface RestaurantDao{

    @Insert
    fun insertRestaurant(restaurantEntity: RestaurantEntity)

    @Delete
    fun deleteRestaurant(restaurantEntity: RestaurantEntity)

    @Query("SELECT * FROM restaurants")
    fun getAllRestaurants(): List<RestaurantEntity>

    @Query("SELECT * FROM restaurants WHERE id = :resId")
    fun getRestaurantById(resId: String): RestaurantEntity
}