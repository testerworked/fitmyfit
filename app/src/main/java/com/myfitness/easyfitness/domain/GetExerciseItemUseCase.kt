package com.myfitness.easyfitness.domain

class GetExerciseItemUseCase(private val exerciseListRepository: ExerciseListRepository){

    fun getExerciseItem(exerciseItemId: Int):ExerciseItem{
        return exerciseListRepository.getExerciseItem(exerciseItemId)
    }
}