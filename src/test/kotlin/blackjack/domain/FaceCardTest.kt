package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FaceCardTest : FunSpec({

    test("King, Queen, Jack 카드는 항상 10 포인트를 반환한다.") {
        DeckType.values().forEach { deckType ->
            FaceType.values().forEach { faceType ->
                val actual = FaceCard(category = deckType, faceType = faceType)

                actual.point(20) shouldBe 10
                actual.point(10) shouldBe 10
                actual.point(0) shouldBe 10
            }
        }
    }

    test("카드는 타입의 첫 글자를 이름으로 가진다.") {
        FaceType.values().forEach { faceType ->
            val actual = FaceCard(category = DeckType.DIAMOND, faceType = faceType)

            actual.name shouldBe faceType.name.first().toString()
        }
    }
})
