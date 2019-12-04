package com.example.bankui_android_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    internal lateinit var login: Button
    internal lateinit var become_a_client: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        login = findViewById(R.id.login)
        become_a_client = findViewById(R.id.become_a_client)

        // this code allow the user to be able to get to the second activity
        login.setOnClickListener(object : View.OnClickListener {
          override fun onClick(view: View) {
                val intent = Intent(applicationContext, Main2Activity::class.java)
                startActivity(intent)
            }
        })
        become_a_client.setOnClickListener(object : View.OnClickListener {

            // this code allow the to be able to third activity
         override fun onClick(view: View) {
                val intent = Intent(applicationContext, Main3Activity::class.java)
                startActivity(intent)
            }
        })
    }
}
