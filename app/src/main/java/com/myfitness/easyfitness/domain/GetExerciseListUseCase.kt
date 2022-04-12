package com.myfitness.easyfitness.domain

class GetExerciseListUseCase(private val exerciseListRepository: ExerciseListRepository){
    fun getExerciseList():List<ExerciseItem>{
        return exerciseListRepository.getExerciseList()
    }
}