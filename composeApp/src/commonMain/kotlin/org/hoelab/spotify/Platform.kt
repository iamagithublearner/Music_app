package org.hoelab.spotify

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform