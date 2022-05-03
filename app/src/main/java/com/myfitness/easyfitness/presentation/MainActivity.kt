package com.myfitness.easyfitness.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.myfitness.easyfitness.R
import com.myfitness.easyfitness.domain.ExerciseItem

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    val TAG: String = "fitmyfit"

    private var count = 0
    private lateinit var llExerciseList: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llExerciseList = findViewById(R.id.ll_exercise_list)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.exerciseList.observe(this){
            Log.d(TAG, it.toString())

//            if(count == 0){
//                count++
//                val item = it[0]
//                viewModel.changeEnableState(item)
//            }
            showList(it)
        }

    }

    private fun showList(list: List<ExerciseItem>){

        for(exerciseItem in list){
            val layoutId = if(exerciseItem.enabled){
                R.layout.item_exercise_enabled
            }else{
                R.layout.item_exercise_disabled
            }
            val view = LayoutInflater.from(this).inflate(layoutId, llExerciseList, false)
            val tvName = view.findViewById<TextView>(R.id.tv_name)
            val tvCount = view.findViewById<TextView>(R.id.tv_count)
            tvName.text = exerciseItem.name
            tvCount.text = exerciseItem.count.toString()
            llExerciseList.addView(view)
        }

    }

}