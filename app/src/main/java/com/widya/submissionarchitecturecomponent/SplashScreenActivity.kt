package com.widya.submissionarchitecturecomponent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.widya.submissionarchitecturecomponent.daftar.DaftarActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        Handler(mainLooper).postDelayed({
            val intent = Intent(this, DaftarActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}