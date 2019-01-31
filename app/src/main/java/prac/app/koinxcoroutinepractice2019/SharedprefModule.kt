package prac.app.koinxcoroutinepractice2019

import android.content.Context
import android.content.SharedPreferences

class SharedprefModule(var ctx:Context){

    fun getPrefs():SharedPreferences{
        return ctx.getSharedPreferences("philips_pref",Context.MODE_PRIVATE)
    }

}