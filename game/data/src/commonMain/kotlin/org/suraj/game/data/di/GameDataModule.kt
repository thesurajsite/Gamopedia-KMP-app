package org.suraj.game.data.di

import org.koin.dsl.module
import org.suraj.game.data.repository.GameRepositoryImpl
import org.suraj.game.domain.repository.GameRepository

fun getGamesModule() = module {
    factory<GameRepository> { GameRepositoryImpl(apiService = get()) }
}