package saiki.app.androidxtestsample

class Janken {
    fun start(p1: String, p2: String): Result {
        if (p1 == "guu" && p2 == "paa"){
            return Result.P2_WIN
        }
        return Result.P1_WIN
    }

    enum class Result {
        P1_WIN,
        P2_WIN
    }
}

