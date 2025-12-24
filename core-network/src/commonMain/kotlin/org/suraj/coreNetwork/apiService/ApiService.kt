package org.suraj.coreNetwork.apiService

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import org.suraj.coreNetwork.model.game.GameResponse

class ApiService(
    val httpClient: HttpClient
) {

    suspend fun getGames(): Result<GameResponse> {
        return try {
            val response = httpClient.get("api/games") {
                url {
                    parameter("key", "d2888939dd874bc0b91f84cde2ad4789")
                }
            }.body<GameResponse>()
            Result.success(response)
        }
        catch (e: Exception){
            Result.failure(e)
        }
    }
}