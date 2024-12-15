package cl.holia.app1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform