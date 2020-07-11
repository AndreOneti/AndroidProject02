package br.com.siecola.androidproject02

import android.app.Application
import android.content.Context

class MainApplication: Application() {

    companion object {
        private var instance: MainApplication? = null
        // Padrao java
        // fun getApplicationContext(): Context {
        //     return instance!!.applicationContext
        // }
        // Padrao kotlin
        fun getApplicationContext(): Context = instance!!.applicationContext
    }

    init {
        instance = this
    }
}