package com.example.kisileruygulamasi.retrofit

import com.example.kisileruygulamasi.retrofit.RetrofitClient
import com.example.kisileruygulamasi.retrofit.KisilerDao

class ApiUtils {
    companion object {
        private const val BASE_URL = "http://kasimadalan.pe.hu/"

        fun getKisilerDao(): KisilerDao {
            return RetrofitClient.getClient(BASE_URL).create(KisilerDao::class.java)
        }
    }
}
