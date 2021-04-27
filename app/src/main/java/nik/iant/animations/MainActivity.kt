package nik.iant.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(android.R.style.Theme_Material_Light_DarkActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val blinkAnim = AnimationUtils.loadAnimation(this, R.anim.blink)
        val txtNik = findViewById<TextView>(R.id.txtNik)
        val btnAnim = findViewById<ImageButton>(R.id.btnAnim)

        txtNik.animation = blinkAnim
        Handler(mainLooper).postDelayed(Runnable {
            val intent = Intent(this, SplashScreen::class.java)
            startActivity(intent)
        }, 3000)
    }
}