package com.cibertec.servicego

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cibertec.servicego.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // ViewBinding permite conectar el archivo activity_main.xml con Kotlin
    // sin usar findViewById. En clase se agregarán los componentes visuales
    // y luego se accederá a ellos desde esta clase.
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Punto de inicio de la clase:
        // aquí se agregarán las llamadas a las funciones del Checkpoint 01.
    }
}
