package com.example.transferfromacttoact

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_third.*

class Third : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        btnThree.setOnClickListener {
            var my_fav=edTextTwo.text.toString()
            var ith= Intent()
            ith.putExtra("my_fav",my_fav)
            setResult(Activity.RESULT_OK,ith)
            finish()
        }
    }
}
