package tradingcards.repository

import tradingcards.model.CardSet
import tradingcards.model.TradingCardGame

class CardRepository {

    fun getCardSets(type: String): List<CardSet> {
        require(getType().any { it.name == type })

        return emptyList()
    }

    fun getType(): List<TradingCardGame> = TradingCardGame.values().toList()
}