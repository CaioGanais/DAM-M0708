package cat.caioganaisitb.scottpilgrimmemory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
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
        var diff: String
        val spinner: Spinner = findViewById(R.id.spinner_button)
        val difficulty = resources.getStringArray(R.array.difficulty)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, difficulty)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@MenuLayout, "Select something", Toast.LENGTH_SHORT)
                    .show()
            }
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                diff = if(position != 0){
                    difficulty[position]
                } else ({
                    null
                }).toString()
            }
        }
    }
} 