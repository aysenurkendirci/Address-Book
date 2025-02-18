package com.example.kisileruygulamasi.di

import androidx.room.Room
import com.example.kisileruygulamasi.data.datasource.KisilerDataSource
import com.example.kisileruygulamasi.data.repo.KisilerRepository
import com.example.kisileruygulamasi.room.KisilerDao
import com.example.kisileruygulamasi.room.Veritabani
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.Contexts
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideKisilerDataSource(kdao:KisilerDao):KisilerDataSource{
        return KisilerDataSource(kdao)
    }

    @Provides
    @Singleton
    fun provideKisilerRepository(kda:KisilerDataSource):KisilerRepository{
        return KisilerRepository(kda)
    }

    @Provides
    @Singleton
    fun provideKisilerDao(@ApplicationContext contexts: Contexts) : KisilerDao{
        val vt= Room.databaseBuilder(contexts,Veritabani::class.java,"rehber.sqlite")
            .createFromAsset("rehber.sqlite").build()
        return vt.getKisilerDao()
    }
}