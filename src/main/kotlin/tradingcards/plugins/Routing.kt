package tradingcards.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import tradingcards.routes.cardRoutes

fun Application.configureRouting() {
    routing {
        cardRoutes()
    }
}
