package com.example.muhammadfarrelardan_32602100006

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btnRecycleview: Button
    private lateinit var btnFragment: Button
    private lateinit var btnNavigasi: Button

    private lateinit var btnRetrofit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn_explisit)

        // Explisit Intent
        btn1.setOnClickListener {
            val intentexplisit = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intentexplisit)
        }

        btn2 = findViewById(R.id.btn_implisit)

        // Implisit Intent
        btn2.setOnClickListener {
            val number = "12345"
            val intentImplisit = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $number"))
            startActivity(intentImplisit)
        }

        // Button recycleView
        btnRecycleview = findViewById(R.id.btn_recycleview)

        btnRecycleview.setOnClickListener {
            val recycleView = Intent(this@MainActivity, RecyclerActivity::class.java)
            startActivity(recycleView)
        }

        // Button Fragment
        btnFragment = findViewById(R.id.btn_fragment)

        btnFragment.setOnClickListener {
            val toFragment = Intent(this@MainActivity, FragmentActivity::class.java)
            startActivity(toFragment)
        }

        // Button Navigasi
        btnNavigasi = findViewById(R.id.btn_navigasi)

        btnNavigasi.setOnClickListener {
            val toNavigasi = Intent(this@MainActivity, BottomNavigasiActivity::class.java)
            startActivity(toNavigasi)
        }

        // Button Retrofit
        btnRetrofit = findViewById(R.id.btn_retrofit)

        btnRetrofit.setOnClickListener {
            val toRetrofit = Intent(this@MainActivity, RetrofitActivity::class.java)
            startActivity(toRetrofit)
        }
    }
}