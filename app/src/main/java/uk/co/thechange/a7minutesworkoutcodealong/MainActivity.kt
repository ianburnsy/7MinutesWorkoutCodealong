package uk.co.thechange.a7minutesworkoutcodealong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import uk.co.thechange.a7minutesworkoutcodealong.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // inflating the xml file from the binding
        setContentView(binding?.root) // constraint layout is the route.

        // create entry point for button using viewbinding...
        binding?.flStart?.setOnClickListener{

        //create an intent so we can move from start button to exercise
            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }
    /*
        // creating an entry point for the button using findViewById
        val flStartButton : FrameLayout = findViewById(R.id.flStart)
        flStartButton.setOnClickListener{
            Toast.makeText(
                this@MainActivity, // haven't used this format before?
                "Here we will start the exercise",
                Toast.LENGTH_SHORT
            ).show()
        }

     */
    }
    override  fun onDestroy(){
        super.onDestroy()
        binding = null
    }
}
