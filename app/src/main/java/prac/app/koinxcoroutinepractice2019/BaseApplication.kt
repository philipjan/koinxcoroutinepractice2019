package prac.app.koinxcoroutinepractice2019

import android.app.Application
import org.koin.android.ext.android.startKoin

class BaseApplication:Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(appModule))

    }
}