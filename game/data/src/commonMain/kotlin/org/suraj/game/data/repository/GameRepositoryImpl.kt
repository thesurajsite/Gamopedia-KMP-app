package org.suraj.game.data.repository

import org.suraj.coreNetwork.apiService.ApiService
import org.suraj.game.data.mappers.toDomainListOfGames
import org.suraj.game.domain.model.Game
import org.suraj.game.domain.repository.GameRepository

class GameRepositoryImpl(
    private val apiService: ApiService
): GameRepository {
    override suspend fun getGames(): Result<List<Game>> {
        val result = apiService.getGames()
        return if(result.isSuccess){
            Result.success(result.getOrThrow().results.toDomainListOfGames())
        }else{
            Result.failure(result.exceptionOrNull()!!)
        }
    }
}