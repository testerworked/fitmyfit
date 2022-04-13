package com.myfitness.easyfitness.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.myfitness.easyfitness.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    val TAG: String = "fitmyfit"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.exerciseList.observe(this){
            Log.d(TAG, it.toString())
        }

    }

}