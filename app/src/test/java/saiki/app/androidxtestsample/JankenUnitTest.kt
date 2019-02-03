package saiki.app.androidxtestsample

import org.junit.Assert.assertEquals
import org.junit.Test
import saiki.app.androidxtestsample.Janken.Result.P1_WIN
import saiki.app.androidxtestsample.Janken.Result.P2_WIN

class JankenUnitTest {
    private val subject = Janken()

    @Test
    fun janken_グー対チョキなら1pが勝つ() {
        val result = subject.start("guu","choki")

        assertEquals(P1_WIN,result)
    }

    @Test
    fun janken_チョキ対パーなら1pが勝つ() {
        val result = subject.start("choki","paa")

        assertEquals(P1_WIN,result)
    }

    @Test
    fun janken_グー対パーなら2pが勝つ() {
        val result = subject.start("guu","paa")

        assertEquals(P2_WIN,result)
    }


}
