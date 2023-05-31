package tradingcards.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import tradingcards.model.CardSet
import tradingcards.model.TradingCardGame

class CardRepository {

    fun cardSets(): List<CardSet> {
        return emptyList()
    }

    fun getType(): List<TradingCardGame> = TradingCardGame.values().toList()
}