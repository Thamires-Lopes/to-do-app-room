package com.example.todoapproom

import android.app.Application
import com.example.todoapproom.di.mainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApp)

            modules(mainModule)
        }
    }
}