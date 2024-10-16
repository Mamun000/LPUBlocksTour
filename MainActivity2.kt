package com.example.aftermid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val a = findViewById<ImageButton>(R.id.imageButton1)
        val b = findViewById<ImageButton>(R.id.imageButton2)
        val c = findViewById<ImageButton>(R.id.imageButton3)
        val d = findViewById<ImageButton>(R.id.imageButton4)
        val e = findViewById<ImageButton>(R.id.imageButton5)
        val f = findViewById<ImageButton>(R.id.imageButton6)
        val g = findViewById<ImageButton>(R.id.imageButton7)
        val h = findViewById<ImageButton>(R.id.imageButton8)
        val i = findViewById<ImageButton>(R.id.imageButton9)

        a.setOnClickListener {
            val j = Intent(this, MainActivity3::class.java)
            startActivity(j)
        }


        b.setOnClickListener {
            val j = Intent(this, Law::class.java)
            startActivity(j)
        }

        c.setOnClickListener {
            val j = Intent(this, Civil::class.java)
            startActivity(j)
        }

        d.setOnClickListener {
            val j = Intent(this, Bio::class.java)
            startActivity(j)
        }

        e.setOnClickListener {
            val j = Intent(this, Business::class.java)
            startActivity(j)
        }

        f.setOnClickListener {
            val j = Intent(this, Computer::class.java)
            startActivity(j)
        }

        g.setOnClickListener {
            val j = Intent(this, Online::class.java)
            startActivity(j)
        }

        h.setOnClickListener {
            val j = Intent(this, Mca::class.java)
            startActivity(j)
        }

        i.setOnClickListener {
            val j = Intent(this, Media::class.java)
            startActivity(j)
        }


    }
}