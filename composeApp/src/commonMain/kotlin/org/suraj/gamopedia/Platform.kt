package org.suraj.gamopedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform