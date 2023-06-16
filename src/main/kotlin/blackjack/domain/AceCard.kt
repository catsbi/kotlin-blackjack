package blackjack.domain

import kotlin.math.abs

class AceCard(override val category: DeckType) : Card {

    override val name: String
        get() = ACE_NAME

    override fun point(input: Int): Int =
        if (abs(THRESHOLD - (MIN_VALUE + input)) < abs(THRESHOLD - (MAX_VALUE + input))) MIN_VALUE else MAX_VALUE

    companion object {
        private const val ACE_NAME = "A"
        const val MIN_VALUE = 1
        const val MAX_VALUE = 11
        const val THRESHOLD = 21
    }

}
