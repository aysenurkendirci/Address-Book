package com.example.kisileruygulamasi.data.datasource

import android.util.Log
import com.example.kisileruygulamasi.data.entity.Kisiler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class KisilerDataSource {
    suspend fun kisileriYukle() : List<Kisiler> =
        withContext(Dispatchers.IO){
            val kisilerListesi = arrayListOf<Kisiler>()
            val k1= Kisiler(1,"Ahmet","1111")
            val k2= Kisiler(2,"Zeynep","2222")
            val k3= Kisiler(3,"Beyza","3333")
            kisilerListesi.add(k1)
            kisilerListesi.add(k2)
            kisilerListesi.add(k3)
            return@withContext kisilerListesi
        }

   suspend fun ara(aramaKelimesi:String): List<Kisiler> =
       withContext(Dispatchers.IO){
           val kisilerListesi = arrayListOf<Kisiler>()
           val k1= Kisiler(1,"Ahmet","1111")
              kisilerListesi.add(k1)
          return@withContext kisilerListesi
       }

    suspend fun kaydet(kisi_ad:String,kisi_tel:String){
        Log.e("Kisi Kaydet","$kisi_ad - $kisi_tel")
    }
    suspend fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String){
        Log.e("Kisi Güncelle","$kisi_ad - $kisi_tel")
    }
    suspend fun sil(kisi_id:Int){
        Log.e("Kişi sİL",kisi_id.toString())
    }
}