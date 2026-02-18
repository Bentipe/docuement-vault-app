package space.miguelnicolas.documentvault

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform