package com.example.sukoon

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.os.Bundle
import com.example.sukoon.ui.MainActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(saveInstanceState: Bundle?) {
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_splash)

        val SPLASH_TIME_OUT = 4000
        val homeIntent = Intent(this@SplashActivity, MainActivity::class.java)
        android.os.Handler().postDelayed({

            startActivity(homeIntent)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }
}
