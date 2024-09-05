package com.example.animeku.User

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.animeku.R

class LoginActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        val moveRegister :TextView = findViewById(R.id.register)
        moveRegister.setOnClickListener(this)
    }

    override fun onClick(v : View?) {
        when(v?.id){
            R.id.register ->{
                    val moveIntent = Intent(this@LoginActivity, RegisterActivity::class.java)
                    startActivity(moveIntent)
            }
        }
    }
}