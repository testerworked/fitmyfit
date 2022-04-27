package com.myfitness.easyfitness.domain

import androidx.lifecycle.LiveData

class GetExerciseListUseCase(private val exerciseListRepository: ExerciseListRepository){

    //fun getExerciseList():List<ExerciseItem>{
    //    return exerciseListRepository.getExerciseList()
    //}

    fun getExerciseList() : LiveData<List<ExerciseItem>>{
        return exerciseListRepository.getExerciseList()
    }

}