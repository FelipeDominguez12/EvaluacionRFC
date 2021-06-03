package com.example.rfc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generarRFC();
    }

    private fun generarRFC() {
        var botonGenerar = findViewById<Button>(R.id.btnGenerar)
        botonGenerar.setOnClickListener{
            var txtNombre = findViewById<EditText>(R.id.Name)
            var txtApePat = findViewById<EditText>(R.id.apePat)
            var txtApeMat = findViewById<EditText>(R.id.apeMat)


            var nombre = txtNombre.text.toString()
            var apePat = txtApePat.text.toString()
            var apeMat = txtApeMat.text.toString()

            var txtResultado = findViewById<TextView>(R.id.Resultadorfc)

            /*Condiciones*/

            if (nombre==""){
                txtResultado.text = "Por favor introducir nombre"
            } else if(apePat==""){
                txtResultado.text = "Por favor introducir Apellido Paterno"
            } else if(apeMat==""){

            } else{
                txtResultado.text = "${apePat.toString().substring(0,2)}"+"${apeMat.toString().substring(0,1)}"+"${nombre.toString().substring(0,1)}"
            }
        }

        /*Generacion de Homoclave*/

    }
}