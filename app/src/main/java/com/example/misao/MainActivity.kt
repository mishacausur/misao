package com.example.misao

import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this).apply {
            text  = "Brand new text"
            gravity = Gravity.CENTER
            setTypeface(Typeface.DEFAULT_BOLD)
            layoutParams = ConstraintLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT)
        }
        setContentView(textView)
    }
}