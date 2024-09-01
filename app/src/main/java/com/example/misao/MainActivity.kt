package com.example.misao

import android.annotation.SuppressLint
import android.graphics.Typeface
import android.os.Bundle
import android.text.Layout.Alignment
import android.text.Layout.Alignment.*
import android.view.Gravity
import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.TextView
import androidx.appcompat.app.ActionBar.LayoutParams
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginEnd
import androidx.core.view.marginStart
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = ConstraintLayout(this).apply {
            layoutParams = ConstraintLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT)
        }
        val textView = TextView(this).apply {
            text  = "Brand new text"
            textAlignment = 1
            textSize = 24f
            gravity = Gravity.CENTER
            setTypeface(Typeface.DEFAULT_BOLD)
            id = 150
        }

        val button = MaterialButton(this).apply {
            text = "Continue"
            id = 151

            layoutParams = LayoutParams(MATCH_PARENT, WRAP_CONTENT).apply {
                marginStart = 32
                marginEnd = 32
            }

            cornerRadius = 12
        }

        layout.addView(textView)
        layout.addView(button)

        val textParams = textView.layoutParams as ConstraintLayout.LayoutParams
        text
        textParams.topToTop = MATCH_PARENT
        textParams.startToStart = MATCH_PARENT
        textParams.endToEnd = MATCH_PARENT

        val buttonParams = button.layoutParams as ConstraintLayout.LayoutParams
        buttonParams.topToBottom = 150
        buttonParams.startToStart = MATCH_PARENT
        buttonParams.endToEnd = MATCH_PARENT

        textParams.verticalChainStyle = ConstraintLayout.LayoutParams.CHAIN_PACKED
        buttonParams.verticalChainStyle = ConstraintLayout.LayoutParams.CHAIN_PACKED
        setContentView(layout)
    }
}