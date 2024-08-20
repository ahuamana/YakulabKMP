package com.yakulab.client

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform