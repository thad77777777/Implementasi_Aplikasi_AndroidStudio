package com.example.muhammadfarrelardan_32602100006

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    private lateinit var btn3: Button
    private lateinit var btn4: Button

    private val PICK_IMAGE_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btn3 = findViewById(R.id.btn_moveActivity)

        // Explisit Intent
        btn3.setOnClickListener {
            val moveIntent = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(moveIntent)
        }

        btn4 = findViewById(R.id.btn_implicitGallery)

        // Implisit Intent ke Gallery
        btn4.setOnClickListener {
            val galleryIntent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(galleryIntent, PICK_IMAGE_REQUEST)
        }
    }
}