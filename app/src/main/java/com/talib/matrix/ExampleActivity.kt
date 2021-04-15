package com.talib.matrix

import android.content.DialogInterface
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.talib.matrix.databinding.ActivityExampleBinding
import com.talib.matrix.model.User


class ExampleActivity : AppCompatActivity() {

    lateinit var databinding: ActivityExampleBinding

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databinding = DataBindingUtil.setContentView(this, R.layout.activity_example)
        setContentView(databinding.root)
        databinding.mail = "adsdasda@gmail.com"
        databinding.user = User("Name", "Sur")
//
//        val button: Button = findViewById(R.id.crop)
//        val button2: Button = findViewById(R.id.textv)
//
//
//        button.setOnClickListener {
//            val alertDialog: AlertDialog = AlertDialog.Builder(this).create()
//            Log.d("asfdasfas", alertDialog.toString())
//            alertDialog.setTitle("Alert")
//            alertDialog.setMessage("Alert message to be shown")
//            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK") { dialogInterface: DialogInterface, i: Int ->
//                Log.d("asfdasfas", dialogInterface.toString())
//                Log.d("asfdasfas", i.toString())
//            }
//            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel") { dialogInterface: DialogInterface, i: Int ->
//                Log.d("asfdasfas", dialogInterface.toString())
//                Log.d("asfdasfas", i.toString())
//            }
//            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Neutral") { dialogInterface: DialogInterface, i: Int ->
//                Log.d("asfdasfas", dialogInterface.toString())
//                Log.d("asfdasfas", i.toString())
//            }
//            alertDialog.show()
//        }
//
//        button2.setOnClickListener{
//            val customDialog = CustomBottomSheetDialog()
//            Log.d("afasfasfasf",CustomDialog::class.java.canonicalName)
//            customDialog.show(supportFragmentManager,CustomDialog::class.java.canonicalName)
//
//        }



    }


}