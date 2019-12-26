package com.example.transferfromacttoact

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnTwo.setOnClickListener {

            var my_name=edTextOne.text.toString()
            var i=Intent()
            i.putExtra("my_name",my_name)
            setResult(Activity.RESULT_OK,i)
            finish()

        }
    }
}
