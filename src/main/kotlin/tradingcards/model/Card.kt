package tradingcards.model

data class Card(
    val id: String,
    val idSet: String,
    val number: Int,
    val name: String,
    val urlSmall: String,
    val urlLarge: String,
    val supertype: String,
    val tradingCardGame: TradingCardGame,
)