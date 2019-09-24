package es.eriktorr.katas

import es.eriktorr.katas.matchers.{AdvantageMatcher, DeuceMatcher, InvalidMatcher, ZeroToThreeMatcher}

class TennisScoreCalculator {

  private val matchers: List[ScoreMatcher] = List(
    DeuceMatcher,
    AdvantageMatcher,
    ZeroToThreeMatcher)

  def score(player1Points: Int, player2Points: Int): String = {
    matchers.find(_.matches(player1Points, player2Points))
      .getOrElse(InvalidMatcher)
      .tennisScoreFrom(player1Points, player2Points)
  }

}
