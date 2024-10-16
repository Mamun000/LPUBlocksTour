package com.example.aftermid

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val rootView = window.decorView.findViewById<android.view.View>(android.R.id.content)
        Snackbar.make(rootView, "Welcome to School of Agriculture", Snackbar.LENGTH_LONG)
            .setAction("Undo") {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }.show()
    }
}
