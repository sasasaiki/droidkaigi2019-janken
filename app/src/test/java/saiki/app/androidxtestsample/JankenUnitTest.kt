package saiki.app.androidxtestsample

import org.junit.Test

import org.junit.Assert.*
import saiki.app.androidxtestsample.Hand.*
import saiki.app.androidxtestsample.RESULT.*

class JankenUnitTest {

    val subject = Janken()


    @Test
    fun janken_グー対チョキなら1pが勝つ() {
        val winner = subject.pon(GUU, CHOKI)

        assertEquals(P1, winner)
    }

    @Test
    fun janken_チョキ対パーなら1pが勝つ() {
        val winner = subject.pon(CHOKI, PAR)

        assertEquals(P1, winner)
    }

    @Test
    fun janken_グー対パーなら2pが勝つ() {
        val winner = subject.pon(GUU, PAR)

        assertEquals(P2, winner)
    }


}
