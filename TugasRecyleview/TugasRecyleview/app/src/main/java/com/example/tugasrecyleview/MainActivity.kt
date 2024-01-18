package com.example.tugasrecyleviewfarrel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvData: RecyclerView
    private var listMahasiswa = ArrayList<Mahasiswa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvData = findViewById(R.id.rv_mahasiswa)
        rvData.setHasFixedSize(true)
        rvData.layoutManager = LinearLayoutManager(this)

        listMahasiswa.add(Mahasiswa("Muhammad", "32602100006"))
        listMahasiswa.add(Mahasiswa("Farrel", "32602100126"))
        listMahasiswa.add(Mahasiswa("Ardan", "32602100022"))
        listMahasiswa.add(Mahasiswa("Alif", "32602100106"))
        listMahasiswa.add(Mahasiswa("Baihaqi", "32602100001"))
        listMahasiswa.add(Mahasiswa("Imam", "32602100066"))
        listMahasiswa.add(Mahasiswa("Bagus", "32602100016"))
        listMahasiswa.add(Mahasiswa("Royco", "32602100122"))
        listMahasiswa.add(Mahasiswa("Whynot", "32602100136"))
        listMahasiswa.add(Mahasiswa("Muslin", "32602100012"))

        val mahasiswaAdapter = MahasiswaAdapter(listMahasiswa)
        rvData.adapter = mahasiswaAdapter
    }
}