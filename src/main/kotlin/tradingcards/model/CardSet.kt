package tradingcards.model

data class CardSet(val id: String,
    val name: String,
    val tradingCardGame: TradingCardGame,
    val symbol: String,
    val releaseDate: String,
)