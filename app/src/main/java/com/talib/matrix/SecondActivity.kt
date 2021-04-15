package com.talib.matrix

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.talib.matrix.PreferenceHelper.set
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val button: Button = findViewById(R.id.cvbGonder)

        button.setOnClickListener {
            val intent = Intent(intent)
            intent.putExtra("uri","file:location://sdasd")
            setResult(11,intent)
            finish()
        }

    }
}