package cat.caioganaisitb.scottpilgrimmemory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.app.Service
import cat.caioganaisitb.scottpilgrimmemory.databinding.CardsBinding
import java.util.*

private lateinit var binding: CardsBinding

class Cards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CardsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.timer.start()




    }

}



