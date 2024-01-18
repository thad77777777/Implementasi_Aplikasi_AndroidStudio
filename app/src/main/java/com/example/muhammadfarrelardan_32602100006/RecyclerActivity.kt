package com.example.muhammadfarrelardan_32602100006

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerActivity : AppCompatActivity() {

    private lateinit var rvData: RecyclerView
    private var listMahasiswa = ArrayList<Mahasiswa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        rvData = findViewById(R.id.rc_data)
        rvData.setHasFixedSize(true)
        rvData.layoutManager = LinearLayoutManager(this)

        listMahasiswa.add(Mahasiswa("Muhammad", "32602100006"))
        listMahasiswa.add(Mahasiswa("Farrel", "32602100126"))
        listMahasiswa.add(Mahasiswa("Ardan", "32602100022"))
        listMahasiswa.add(Mahasiswa("Alif", "32602100106"))
        listMahasiswa.add(Mahasiswa("Baihaqi", "32602100001"))

        val mahasiswaAdapter = MahasiswaAdapter(listMahasiswa)
        rvData.adapter = mahasiswaAdapter
    }
}