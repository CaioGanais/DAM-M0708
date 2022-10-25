package cat.caioganaisitb.scottpilgrimmemory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import cat.caioganaisitb.scottpilgrimmemory.databinding.MenuLayoutBinding

class MenuLayout : AppCompatActivity() {

    private lateinit var  nBinding: MenuLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_layout)

        val btn: Button = findViewById(R.id.start_button)
        btn.setOnClickListener{
            val intent = Intent(this, Cards::class.java)
            startActivity(intent)
        }

        nBinding = MenuLayoutBinding.inflate(layoutInflater)
        setContentView(nBinding.root)

        val spinner: Spinner = findViewById(R.id.spinner_button)
        val difficulty = resources.getStringArray(R.array.difficulty)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, difficulty)
        spinner.adapter = adapter
    }
} 