package com.example.planeto

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_planet_detail.*

class PlanetDetail : AppCompatActivity() {

    private lateinit var planetObject: PlanetData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet_detail)

        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        planetObject = intent.getParcelableExtra("DATA")!!

        setData(planetObject)

        book_info.setOnClickListener {
            Toast.makeText(
                this,
                "Oooppss!!! Currently the service is not provided",
                Toast.LENGTH_LONG
            ).show()
        }
    }

    private fun setData(planetObject: PlanetData) {

        title_info.text = planetObject.title
        galaxy_info.text = planetObject.galaxy
        distance_info.text = "${planetObject.distance} m km"
        gravity_info.text = "${planetObject.gravity} m/s²"
        overview_info.text = planetObject.overview
        planet_info_img.setImageResource(planetObject.planetImage)
    }
}