package ru.axout.threebuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val t = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.bt_1).setOnClickListener(this)
        findViewById<Button>(R.id.bt_2).setOnClickListener(this)
        findViewById<Button>(R.id.bt_3).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.bt_1 -> Log.i(t, "bt_1")
            R.id.bt_2 -> Log.i(t, "bt_2")
            R.id.bt_3 -> Log.i(t, "bt_3")
        }
    }


}

// Более красивое решение, без интерфейса

//class MainActivity : AppCompatActivity() {
//
//    private val t = "MainActivity"
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        findViewById<Button>(R.id.bt_1).setOnClick()
//        findViewById<Button>(R.id.bt_2).setOnClick()
//        findViewById<Button>(R.id.bt_3).setOnClick()
//    }
//
//    private fun Button.setOnClick() {
//        this.setOnClickListener {
//            Log.i(t, this.text.toString())
//        }
//    }
//}