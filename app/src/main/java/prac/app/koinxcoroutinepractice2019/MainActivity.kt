package prac.app.koinxcoroutinepractice2019

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    //injected!
    val prefObj: SharedprefModule by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        editextPref.addTextChangedListener(textWatcher)
    }

    val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            textviewpreview.text = s.toString()
            prefObj.getPrefs().edit().putString("value",s.toString()).apply()

            prefObj.getPrefs().registerOnSharedPreferenceChangeListener( SharedPreferences.OnSharedPreferenceChangeListener { sharedPreferences, key ->
                Log.d("tag","PREF VALUE: ${prefObj.getPrefs().getString(key,"")}")
            })


        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        }


    }

}
