package com.tutorialsbuzz.androidcircularimage

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var name: String? = null;
    var list: MutableList<String>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //elvis
        // val strlength = name?.length ?: -1;
        //? operator
        //val strlength = name?.length
        //!! operator

        if (list!!.isEmpty()) {
            Toast.makeText(this@MainActivity, "isEmpty", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this@MainActivity, "Exception ", Toast.LENGTH_SHORT).show()
        }

        val strlength = name!!.length
        Toast.makeText(this@MainActivity, "" + strlength, Toast.LENGTH_SHORT).show()

    }
}
