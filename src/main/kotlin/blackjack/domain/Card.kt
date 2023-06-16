package blackjack.domain


sealed interface Card {
    val category: DeckType
    val name: String

    fun point(input: Int): Int
}
