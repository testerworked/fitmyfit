package com.myfitness.easyfitness.domain

class EditExerciseItemUseCase(private val exerciseListRepository: ExerciseListRepository) {
    fun editExerciseItem(exerciseItem: ExerciseItem){
        exerciseListRepository.editExerciseItem(exerciseItem)
    }
}