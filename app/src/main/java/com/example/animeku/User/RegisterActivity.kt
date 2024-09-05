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

class RegisterActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        val loginPage : TextView = findViewById(R.id.loginpage);
        loginPage.setOnClickListener(this)
    }

    override fun onClick (v : View?){
        when(v?.id){
            R.id.loginpage -> {
                val moveIntent = Intent(this@RegisterActivity,LoginActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}