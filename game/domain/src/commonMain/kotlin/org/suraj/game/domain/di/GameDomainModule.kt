package org.suraj.game.domain.di

import org.koin.dsl.module
import org.suraj.game.domain.useCases.GetGamesUseCase

fun getGameDomainModule() = module {
    factory { GetGamesUseCase(gameRepository = get()) }
}