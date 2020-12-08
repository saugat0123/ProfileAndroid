package com.saugat.androidlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        var rdgroup: RadioGroup = findViewById(R.id.rdgroup)
        var rbtndog: RadioButton = findViewById(R.id.rbtndog)
        var rbtncat: RadioButton = findViewById(R.id.rbtncat)
        var rbtnrat: RadioButton = findViewById(R.id.rbtnrat)
        var imgview: ImageView = findViewById(R.id.imgview)

        rbtndog.setOnClickListener {
            imgview.setImageResource(R.drawable.dog)
        }
        rbtncat.setOnClickListener {
            imgview.setImageResource(R.drawable.cat)
        }
        rbtnrat.setOnClickListener {
            imgview.setImageResource(R.drawable.rat)
        }
    }

}