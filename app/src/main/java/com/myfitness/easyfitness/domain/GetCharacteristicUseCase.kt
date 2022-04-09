package com.myfitness.easyfitness.domain

class GetCharacteristicUseCase(private val bodyCharacteristicRepository:BodyCharacteristicRepository) {
    fun getCharacteristicUseCase(){
        return bodyCharacteristicRepository.getCharacteristicUseCase()
    }
}