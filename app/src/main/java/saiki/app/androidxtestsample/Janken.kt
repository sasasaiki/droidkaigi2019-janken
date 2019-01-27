package saiki.app.androidxtestsample

import saiki.app.androidxtestsample.Hand.*
import saiki.app.androidxtestsample.RESULT.*

class Janken {
    fun pon(p1: Hand, p2: Hand) : RESULT {
        if (p1 == GUU && p2 == PAR){
            return P2
        }
        return P1
    }
}

enum class Hand{
    GUU,
    CHOKI,
    PAR
}

enum class RESULT{
    P1,
    P2,
    AIKO
}
