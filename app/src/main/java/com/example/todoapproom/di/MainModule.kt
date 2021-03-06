package com.example.todoapproom.di

import androidx.room.Room
import com.example.todoapproom.database.ItemDatabase
import com.example.todoapproom.ui.main.MainViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {

    single {
        Room.databaseBuilder(androidApplication(), ItemDatabase::class.java, "item_database")
            .build()
    }

    single {
        get<ItemDatabase>().getItemDao()
    }

    viewModel {
        MainViewModel()
//        DetailViewModel()
    }
}