package app.test.myratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)

        ratingBar.rating = 2.5f
        ratingBar.stepSize = .5f

        ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Toast.makeText(this,"Rating $rating", Toast.LENGTH_SHORT).show()
        }

    }
}