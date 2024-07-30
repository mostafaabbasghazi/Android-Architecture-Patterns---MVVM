package com.calco.mykotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.calco.mykotlin.viewmodel.CalcViewModel

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var editText1: EditText
    lateinit var editText2: EditText
    lateinit var button: Button
    private  val calc:CalcViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        editText1=findViewById(R.id.editTextNumberSigned)
        editText2=findViewById(R.id.editTextNumberSigned2)
        button=findViewById(R.id.button)
        button.setOnClickListener {
            val name=editText1.text.trim().toString()
            val age=editText2.text.trim().toString()
            calc.calcViewModel(name,age).observe(this, Observer {person->
                Toast.makeText(this,person.age.toString(),Toast.LENGTH_LONG).show()

            })
        }

    }
}