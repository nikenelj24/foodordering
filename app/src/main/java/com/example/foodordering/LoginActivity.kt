package com.example.foodordering

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    lateinit var btn_login : Button
    lateinit var Create : TextView
    lateinit var mUsername : EditText
    lateinit var password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Create = findViewById(R.id.create)
        btn_login = findViewById(R.id.btn_login)
        mUsername = findViewById(R.id.user_id)
        password = findViewById(R.id.sandi)

        Create.setOnClickListener(){
            val intent = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_login.setOnClickListener(){
            val intent = Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
