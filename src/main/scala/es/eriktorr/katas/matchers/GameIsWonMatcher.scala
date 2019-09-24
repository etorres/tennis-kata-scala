package es.eriktorr.katas.matchers

import es.eriktorr.katas.ScoreMatcher

object GameIsWonMatcher extends ScoreMatcher {

  override def matches(player1Points: Int, player2Points: Int): Boolean = {
    (hasAtLeastFourPoints(player1Points) || hasAtLeastFourPoints(player2Points)) &&
      atLeastTwoMorePointThanTheOpponent(player1Points, player2Points)
  }

  override def tennisScoreFrom(player1Points: Int, player2Points: Int): String = {
    if (player1Points > player2Points) "player 1 won" else "player 2 won"
  }

  private def atLeastTwoMorePointThanTheOpponent(player1Points: Int, player2Points: Int) = {
    math.abs(player1Points - player2Points) >= 2
  }

  private def hasAtLeastFourPoints(player1Points: Int) = {
    player1Points >= 4
  }

}
