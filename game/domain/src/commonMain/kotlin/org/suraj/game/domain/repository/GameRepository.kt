package org.suraj.game.domain.repository

import org.suraj.game.domain.model.Game

interface GameRepository {
    suspend fun getGames(): Result<List<Game>>
}