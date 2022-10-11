package cat.caioganaisitb.scottpilgrimmemory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import cat.caioganaisitb.scottpilgrimmemory.databinding.ActivityMainBinding

lateinit var mainActivityBinding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_ScottPilgrimMemory)
        super.onCreate(savedInstanceState)
//        mainActivityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

//        mainActivityBinding.playButton.setOnClickListener(){
//            val intent = Intent(this, MainActivity2::class.java)
//
//        }

        val btn: Button = findViewById(R.id.play_button)
        btn.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


    }
}