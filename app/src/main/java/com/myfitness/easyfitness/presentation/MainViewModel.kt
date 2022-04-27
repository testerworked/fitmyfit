package com.myfitness.easyfitness.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.myfitness.easyfitness.data.ExerciseListRepositoryImpl
import com.myfitness.easyfitness.domain.DeleteExerciseItemUseCase
import com.myfitness.easyfitness.domain.EditExerciseItemUseCase
import com.myfitness.easyfitness.domain.ExerciseItem
import com.myfitness.easyfitness.domain.GetExerciseListUseCase

class MainViewModel: ViewModel() {

    private val repository = ExerciseListRepositoryImpl

    private val getExerciseListUseCase = GetExerciseListUseCase(repository)
    private val deleteExerciseItemUseCase = DeleteExerciseItemUseCase(repository)
    private val editExerciseItemUseCase = EditExerciseItemUseCase(repository)


    val exerciseList = MutableLiveData<List<ExerciseItem>>()

    fun getExerciseList(){
        val list = getExerciseListUseCase.getExerciseList()
        exerciseList.value = list
    }

    fun deleteExerciseItem(exerciseItem: ExerciseItem){
        deleteExerciseItemUseCase.deleteExerciseItemUseCase(exerciseItem)
        getExerciseList()
    }

    fun changeEnableState(exerciseItem: ExerciseItem){
        val newItem = exerciseItem.copy(enabled = !exerciseItem.enabled)
        editExerciseItemUseCase.editExerciseItem(newItem)
        getExerciseList()
    }

}