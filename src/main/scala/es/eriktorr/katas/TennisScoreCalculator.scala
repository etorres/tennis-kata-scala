package es.eriktorr.katas

import es.eriktorr.katas.matchers.{AdvantageMatcher, DeuceMatcher, GameIsWonMatcher, InvalidScoreMatcher, ZeroToThreeMatcher}

class TennisScoreCalculator {

  private val matchers: List[ScoreMatcher] = List(
    DeuceMatcher,
    AdvantageMatcher,
    GameIsWonMatcher,
    ZeroToThreeMatcher)

  def score(player1Points: Int, player2Points: Int): String = {
    matchers.find(_.matches(player1Points, player2Points))
      .getOrElse(InvalidScoreMatcher)
      .tennisScoreFrom(player1Points, player2Points)
  }

}
