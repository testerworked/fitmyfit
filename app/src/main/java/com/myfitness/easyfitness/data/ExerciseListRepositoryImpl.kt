package com.myfitness.easyfitness.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.myfitness.easyfitness.domain.ExerciseItem
import com.myfitness.easyfitness.domain.ExerciseListRepository
import java.lang.RuntimeException

object ExerciseListRepositoryImpl: ExerciseListRepository {

    private val exerciseListLD = MutableLiveData<List<ExerciseItem>>()

    private val exerciseList = mutableListOf<ExerciseItem>()

    private var autoIncrementId = 0

    init {
        for(i in 0 until 10){
            val item = ExerciseItem("Name $i", i, true)
            addExerciseItem(item)
        }
    }

    override fun addExerciseItem(exerciseItem: ExerciseItem) {
        if(exerciseItem.id == ExerciseItem.UNDEFINED_ID){
            exerciseItem.id = autoIncrementId++
        }

        exerciseList.add(exerciseItem)
        updateList()
    }

    override fun deleteExerciseItem(exerciseItem: ExerciseItem) {
        exerciseList.remove(exerciseItem)
        updateList()
    }

    override fun editExerciseItem(exerciseItem: ExerciseItem) {
        val oldElement = getExerciseItem(exerciseItem.id)
        exerciseList.remove(oldElement)
        addExerciseItem(exerciseItem)
    }

    override fun getExerciseItem(exerciseItemId: Int): ExerciseItem {
        return exerciseList.find {
            it.id == exerciseItemId
        } ?: throw RuntimeException("Element with id $exerciseItemId not found")
    }

    override fun getExerciseList(): LiveData<List<ExerciseItem>> {
        return exerciseListLD
    }

    private fun updateList(){
        exerciseListLD.value = exerciseList.toList()
    }
}