package com.myfitness.easyfitness.domain

class UpdateCharacteristicUseCase(private val bodyCharacteristicRepository: BodyCharacteristicRepository) {
    fun updateCharacteristicUseCase(body: Body){
        bodyCharacteristicRepository.updateCharacteristicUseCase(body)
    }
}