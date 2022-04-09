package com.myfitness.easyfitness.domain

class SetCharacteristicUseCase(private val bodyCharacteristicRepository: BodyCharacteristicRepository) {
    fun setCharacteristicCase(body: Body){
        bodyCharacteristicRepository.setCharacteristicCase(body)
    }
}