package prac.app.koinxcoroutinepractice2019

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

open class BaseActivity:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onResume() {
        super.onResume()
    }
}