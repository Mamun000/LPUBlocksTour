package com.example.aftermid

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class Civil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_civil)
        val rootView = window.decorView.findViewById<android.view.View>(android.R.id.content)
        Snackbar.make(rootView, "Welcome to School of Civil Engineering", Snackbar.LENGTH_LONG)
            .setAction("Undo") {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }.show()
    }
}