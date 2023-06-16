package blackjack.domain

class NumberCard(
    override val category: DeckType,
    number: Int
) : Card {

    override val name: String = number.toString()

    init {
        require(name in numberRange) {
            "숫자 카드의 이름은 $MIN_LIMIT ~ $MAX_LIMIT 사이어야 합니다."
        }
    }

    override fun point(input: Int): Int = name.toInt()

    companion object {
        const val MIN_LIMIT = 2
        const val MAX_LIMIT = 9
        private val numberRange = (MIN_LIMIT..MAX_LIMIT).map(Int::toString)
    }
}