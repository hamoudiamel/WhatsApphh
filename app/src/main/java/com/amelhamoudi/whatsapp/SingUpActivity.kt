package com.amelhamoudi.whatsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sing_up.*

class SingUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)
        supportActionBar?.hide()
        btn_login.setOnClickListener {
            val name =
                    edt_name.text.toString()
            val email =
                    edt_email.text.toString()
            val password =
                    edt_password.text.toString()

            if (name.isEmpty()) {
                edt_email.error = "name Required"
                return@setOnClickListener
            }
            if (email.isEmpty()) {
                edt_email.error = "Email Required"
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                edt_password.error = "Password Required"
                return@setOnClickListener
            }

            // Display email and password
            Toast.makeText(this, "$name\n $email \n $password", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, MainActivity ::class.java))


        }
    }
}