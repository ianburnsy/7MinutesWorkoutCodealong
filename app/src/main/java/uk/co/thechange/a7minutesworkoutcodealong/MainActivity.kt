package uk.co.thechange.a7minutesworkoutcodealong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // creating an entry point for the button
        val flStartButton : FrameLayout = findViewById(R.id.flStart)
        flStartButton.setOnClickListener{
            Toast.makeText(
                this@MainActivity, // haven't used this format before?
                "Here we will start the exercise",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}