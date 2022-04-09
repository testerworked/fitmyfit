package com.myfitness.easyfitness.domain

interface BodyCharacteristicRepository {
    fun getCharacteristicUseCase()

    fun setCharacteristicCase(body: Body)

    fun updateCharacteristicUseCase(body: Body)
}