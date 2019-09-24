package es.eriktorr.katas.matchers

import es.eriktorr.katas.ScoreMatcher

object AdvantageMatcher extends ScoreMatcher {

  override def matches(player1Points: Int, player2Points: Int): Boolean = {
    hasAtLeastThreePoints(player1Points) && hasAtLeastThreePoints(player2Points) &&
      oneMorePointThanTheOpponent(player1Points, player2Points)
  }

  override def tennisScoreFrom(player1Points: Int, player2Points: Int): String = {
    if (player1Points > player2Points) "advantage player 1" else "advantage player 2"
  }

  private def oneMorePointThanTheOpponent(player1Points: Int, player2Points: Int) = {
    math.abs(player1Points - player2Points) == 1
  }

  private def hasAtLeastThreePoints(player1Points: Int) = {
    player1Points >= 3
  }

}
