package com.example.kisileruygulamasi.data.repo

import com.example.kisileruygulamasi.data.datasource.KisilerDataSource
import com.example.kisileruygulamasi.data.entity.Kisiler
import kotlinx.coroutines.flow.Flow

class KisilerRepository(var kds: KisilerDataSource) {
    suspend fun kaydet(kisi_ad:String,kisi_tel:String)= kds.kaydet(kisi_ad,kisi_tel)
    suspend fun guncelle(kisi_id:Int,kisi_ad:String,kisi_tel:String) = kds.guncelle(kisi_id,kisi_ad,kisi_tel)
    suspend fun sil(kisi_id:Int)=kds.sil(kisi_id)

    suspend fun kisileriYukle() : Flow<List<Kisiler>> =kds.kisileriYukle()
    suspend fun ara(aramaKelimesi:String):  Flow<List<Kisiler>> = kds.ara(aramaKelimesi)

}