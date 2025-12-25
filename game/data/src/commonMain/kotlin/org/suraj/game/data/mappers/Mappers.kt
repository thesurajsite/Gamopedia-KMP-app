package org.suraj.game.data.mappers

import org.suraj.coreNetwork.model.game.Result
import org.suraj.game.domain.model.Game

fun List<Result>.toDomainListOfGames():List<Game> = map {
    Game(
        id = it.id,
        name = it.name,
        imageUrl = it.background_image
    )
}