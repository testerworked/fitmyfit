package com.myfitness.easyfitness.domain

class AddExerciseItemUseCase(private val exerciseListRepository: ExerciseListRepository) {

    fun addExerciseItem(exerciseItem: ExerciseItem){
        exerciseListRepository.addExerciseItem(exerciseItem)
    }
}