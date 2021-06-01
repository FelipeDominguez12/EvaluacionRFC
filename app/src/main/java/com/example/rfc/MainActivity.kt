package com.example.rfc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generarRFC();
    }

    private fun generarRFC() {
        var txtApePat = findViewById<EditText>(R.id.apePat)
        var txtApeMat = findViewById<EditText>(R.id.apeMat)
        
        findViewById<Button>(R.id.btnGenerar).setOnClickListener(){
            var txtNombre = findViewById<EditText>(R.id.Name)
            var texto = txtNombre.text.toString()
            if (texto==""){
                Toast.makeText(this, "Proporsione un nombre", Toast.LENGTH_LONG).show()
            } else{
                Toast.makeText(this, txtNombre, Toast.LENGTH_LONG).show()
            }
        }

    }
}