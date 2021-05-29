package com.example.homework.database

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.observe
import androidx.recyclerview.widget.RecyclerView
import com.afollestad.materialdialogs.MaterialDialog
import com.afollestad.materialdialogs.customview.customView
import com.afollestad.materialdialogs.customview.getCustomView
import com.example.homework.R
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@Suppress("DEPRECATION")
class CarMainActivity : AppCompatActivity() {

    private val carAdapter by lazy { CarAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_main)

        val viewModel =
            ViewModelProvider.AndroidViewModelFactory(application).create(CarViewModel::class.java)

        val textView = findViewById<TextView>(R.id.text_view)

        val addButton = findViewById<Button>(R.id.btn_add)
        addButton.setOnClickListener {

            MaterialDialog(this).show {
                customView(viewRes = R.layout.cutom_view)
                title = "test"
                positiveButton {
                    val view: View = getCustomView()
                   val newCar = Car(
                        brand = view.findViewById<EditText>(R.id.brand_text_view).text.toString(),
                        price = view.findViewById<EditText>(R.id.price_text_view).text.toString()
                            .toInt(),
                        color = view.findViewById<EditText>(R.id.color_text_view).text.toString()
                        )
                    viewModel.insert(newCar)
                    Toast.makeText(context, "must be create car", Toast.LENGTH_LONG).show()
                }
                negativeButton { dismiss() }
            }
        }

        val clearDataBase = findViewById<Button>(R.id.btn_clear)
        clearDataBase.setOnClickListener {
            viewModel.clearDataBase()
        }

        val carRecycler = findViewById<RecyclerView>(R.id.rv_cars)
        carRecycler.adapter = carAdapter

        val loadButton = findViewById<Button>(R.id.load_button)
        val progressBar = findViewById<ProgressBar>(R.id.progress_bar)




//        viewModel.apply {
//            insert(Car("Volvo", 10000, "Black"))
//            insert(Car("BMW", 12000, "White"))
//            insert(Car("Audi", 20000, "Green"))
//        }


        viewModel.isLoading.observe(this) {
            if (it) progressBar.visibility = View.VISIBLE
            else progressBar.visibility = View.INVISIBLE
        }

        viewModel.carList.observe(this) {
            carAdapter.setCars(it)
        }

        viewModel.flowCarList
            .onEach { carAdapter.setCars(it) }
            .launchIn(lifecycleScope)

        loadButton.setOnClickListener {
            viewModel.loadAllCar()
        }

    }
}