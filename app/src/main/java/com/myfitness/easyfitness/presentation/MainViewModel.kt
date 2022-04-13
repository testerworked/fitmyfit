package com.myfitness.easyfitness.presentation

import androidx.lifecycle.ViewModel
import com.myfitness.easyfitness.data.ExerciseListRepositoryImpl
import com.myfitness.easyfitness.domain.DeleteExerciseItemUseCase
import com.myfitness.easyfitness.domain.EditExerciseItemUseCase
import com.myfitness.easyfitness.domain.GetExerciseListUseCase

class MainViewModel: ViewModel() {

    private val repository = ExerciseListRepositoryImpl

    private val getExerciseListUseCase = GetExerciseListUseCase(repository)
    private val deleteExerciseItemUseCase = DeleteExerciseItemUseCase(repository)
    private val editExerciseItemUseCase = EditExerciseItemUseCase(repository)
}