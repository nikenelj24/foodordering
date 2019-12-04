package com.example.foodordering

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    lateinit var regis_btn : Button
    lateinit var mNama : EditText
    lateinit var mEmail : EditText
    lateinit var mUsername : EditText
    lateinit var mPhone : EditText
    lateinit var mPass : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        regis_btn = findViewById(R.id.btn_regis)
        mNama = findViewById(R.id.nama)
        mUsername = findViewById(R.id.user_idd)
        mEmail = findViewById(R.id.email)
        mPhone = findViewById(R.id.phone)
        mPass = findViewById(R.id.pass)

        regis_btn.setOnClickListener(){
            val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
