package com.myfitness.easyfitness.domain

class DeleteExerciseItemUseCase(private val exerciseListRepository: ExerciseListRepository) {
    fun deleteExerciseItemUseCase(exerciseItem: ExerciseItem){
        exerciseListRepository.deleteExerciseItem(exerciseItem)
    }
}