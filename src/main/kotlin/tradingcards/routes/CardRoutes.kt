package tradingcards.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import tradingcards.repository.CardRepository

fun Route.cardRoutes() {
    val cardRepository = CardRepository()

    get("/games") {
        call.respond(cardRepository.getType())
    }

    get("/cardsets/{type?}") {
        val type = call.parameters["type"] ?: ""

        if (type.isEmpty()) {
            call.respondText("Missing type", status = HttpStatusCode.BadRequest)
        }

        call.respond(cardRepository.getCardSets(type))
    }
}