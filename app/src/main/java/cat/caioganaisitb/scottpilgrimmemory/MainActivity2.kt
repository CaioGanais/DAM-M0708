package cat.caioganaisitb.scottpilgrimmemory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val spinner: Spinner = findViewById(R.id.spinner_button)
        val difficulty = resources.getStringArray(R.array.difficulty)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, difficulty)
        spinner.adapter = adapter
/*
        spinner.onItemSelectedListener = object : adapter.OnItemSelectedListener,
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: adapter<*>?) {

            }

            override fun onItemSelected(parent: adapter<*>?, view: View?, position: Int, id: Long) {

            }

        }

 */
    }
}