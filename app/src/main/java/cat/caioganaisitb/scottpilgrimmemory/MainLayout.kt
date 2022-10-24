package cat.caioganaisitb.scottpilgrimmemory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_ScottPilgrimMemory)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)


        val btn: Button = findViewById(R.id.play_button)
        btn.setOnClickListener{
            val intent = Intent(this, MenuLayout::class.java)
            startActivity(intent)
        }


    }
}