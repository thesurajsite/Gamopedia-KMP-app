package org.suraj.coreNetwork.di

import org.koin.dsl.module
import org.suraj.coreNetwork.apiService.ApiService
import org.suraj.coreNetwork.client.KtorClient

fun getCoreNetworkModule() = module {
    single { ApiService(httpClient = KtorClient.getInstance()) }
}