package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_agro.*


class Agro : AppCompatActivity() {

    lateinit var viewModel: AgroViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agro)
        viewModel = ViewModelProvider(this).get(AgroViewModel::class.java)

        val cornMinsk = findViewById<TextView>(R.id.corn_box_minsk)
        val potatoMinsk = findViewById<TextView>(R.id.potato_box_minsk)
        val cucumberMinsk = findViewById<TextView>(R.id.cucumber_box_minsk)

        val cornGomel = findViewById<TextView>(R.id.corn_box_gomel)
        val potatoGomel = findViewById<TextView>(R.id.potato_box_gomel)
        val cucumberGomel = findViewById<TextView>(R.id.cucumber_box_gomel)

        val cornBrest = findViewById<TextView>(R.id.corn_box_brest)
        val potatoBrest = findViewById<TextView>(R.id.potato_box_brest)
        val cucumberBrest = findViewById<TextView>(R.id.cucumber_box_brest)

        val position1 = findViewById<TextView>(R.id.position_minsk)
        val position2 = findViewById<TextView>(R.id.position_gomel)
        val position3 = findViewById<TextView>(R.id.position_brest)


        viewModel.sumCornMinsk.observe(this, Observer<Int> {
            cornMinsk.text = it.toString()
        }
        )

        viewModel.sumPotatoMinsk.observe(this, Observer<Int> {
            potatoMinsk.text = it.toString()
        }
        )

        viewModel.sumCucumberMinsk.observe(this, Observer<Int> {
            cucumberMinsk.text = it.toString()
        }
        )

        viewModel.sumCornGomel.observe(this, Observer<Int> {
            cornGomel.text = it.toString()
        }
        )

        viewModel.sumPotatoGomel.observe(this, Observer<Int> {
            potatoGomel.text = it.toString()
        }
        )

        viewModel.sumCucumberGomel.observe(this, Observer<Int> {
            cucumberGomel.text = it.toString()
        }
        )

        viewModel.sumCornBrest.observe(this, Observer<Int> {
            cornBrest.text = it.toString()
        }
        )

        viewModel.sumPotatoBrest.observe(this, Observer<Int> {
            potatoBrest.text = it.toString()
        }
        )

        viewModel.sumCucumberBrest.observe(this, Observer<Int> {
            cucumberBrest.text = it.toString()
        }
        )

        viewModel.positionOfRegionMinsk.observe(this, Observer<Int> {
            position1.text = it.toString()
        })
        viewModel.positionOfRegionGomel.observe(this, Observer<Int> {
            position2.text = it.toString()
        })
        viewModel.positionOfRegionBrest.observe(this, Observer<Int> {
            position3.text = it.toString()
        })

        button_start.setOnClickListener {
            viewModel.beginningWork()
        }
    }


}


