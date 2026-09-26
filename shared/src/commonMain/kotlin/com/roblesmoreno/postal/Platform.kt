package com.roblesmoreno.postal

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform