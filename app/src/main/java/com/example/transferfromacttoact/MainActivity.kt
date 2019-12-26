package com.example.transferfromacttoact

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOne.setOnClickListener {

            var i=Intent("com.soha.second")
            startActivityForResult(i,2)
        }

        btnOne1.setOnClickListener {

            var ith=Intent("com.soha.third")
            startActivityForResult(ith,3)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==2&&resultCode== Activity.RESULT_OK)
        {
            var x=data!!.extras?.getString("my_name")
            Toast.makeText(this,x,Toast.LENGTH_LONG).show()
        }
        else if(requestCode==3&&resultCode== Activity.RESULT_OK)
        {
            var y=data!!.extras?.getString("my_fav")
            Toast.makeText(this,y,Toast.LENGTH_LONG).show()
        }

    }
}
