package com.example.kisileruygulamasi.room

import androidx.room.Dao
import androidx.room.Query
import com.example.kisileruygulamasi.data.entity.Kisiler

@Dao
interface KisilerDao {

    @Query("SELECT * FROM kisiler")
    suspend fun kisileriYukle(): List<Kisiler>
}
