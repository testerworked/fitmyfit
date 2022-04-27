package com.myfitness.easyfitness.domain

import androidx.lifecycle.LiveData

interface ExerciseListRepository {

    fun addExerciseItem(exerciseItem: ExerciseItem)

    fun deleteExerciseItem(exerciseItem: ExerciseItem)

    fun editExerciseItem(exerciseItem: ExerciseItem)

    fun getExerciseItem(exerciseItemId: Int):ExerciseItem

    fun getExerciseList(): LiveData<List<ExerciseItem>>
}