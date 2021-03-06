package com.gellertbiro.birthdaychallenge

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BirthdayApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@BirthdayApplication)
            modules(appModule, coreModule)
        }
    }
}