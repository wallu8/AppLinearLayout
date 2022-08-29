package com.example.applinearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // finding the UI elements
        title = "LinearLayout App"

        val inputNama = findViewById<EditText>(R.id.editTxtNama)
        val inputNIM = findViewById<EditText>(R.id.editTxtNim)
        val tampilNama = findViewById<TextView>(R.id.txtViewNama)
        val tampilNim = findViewById<TextView>(R.id.txtViewNim)
        val tombolTampil = findViewById<Button>(R.id.buttonTampil)

        tombolTampil.setOnClickListener() {
            val valueNama: String = inputNama.text.toString()
            val valueNim: String = inputNIM.text.toString()

            if ((valueNama == null || valueNama.trim()=="")||(valueNim == null || valueNim.trim()=="")){
                Toast.makeText(this,"Nama/NIM masih kosong, silahkan inputkan!",Toast.LENGTH_LONG).show()
            }
            else{
                tampilNama.setText(valueNama).toString()
                tampilNim.setText(valueNim).toString()
            }
        }
    }
}