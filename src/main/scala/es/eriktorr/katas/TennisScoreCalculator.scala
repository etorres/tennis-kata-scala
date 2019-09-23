package es.eriktorr.katas

import es.eriktorr.katas.matchers.{DeuceMatcher, InvalidMatcher}

class TennisScoreCalculator {

  private val matchers: List[DeuceMatcher.type] = List(DeuceMatcher)

  def score(player1Points: Int, player2Points: Int): String = {
    matchers.find(_.matches(player1Points, player2Points))
      .getOrElse(InvalidMatcher)
      .tennisScoreFrom(player1Points, player2Points)
  }

}
