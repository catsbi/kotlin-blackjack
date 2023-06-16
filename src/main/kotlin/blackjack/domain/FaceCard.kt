package blackjack.domain

enum class FaceType {
    KING, QUEEN, JACK;

    fun firstChar(): Char = name.first()
}

class FaceCard(override val category: DeckType, val faceType: FaceType) : Card {

    override val name: String
        get() = faceType.firstChar().toString()

    override fun point(input: Int): Int = POINT

    companion object {
        private const val POINT = 10
    }
}
