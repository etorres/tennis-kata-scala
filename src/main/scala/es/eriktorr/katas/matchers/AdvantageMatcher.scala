package es.eriktorr.katas.matchers

import es.eriktorr.katas.ScoreMatcher

object AdvantageMatcher extends ScoreMatcher {

  override def matches(player1Points: Int, player2Points: Int): Boolean = {
    player1Points >= 3 && player2Points >= 3 && math.abs(player1Points - player2Points) == 1
  }

  override def tennisScoreFrom(player1Points: Int, player2Points: Int): String = {
    if (player1Points > player2Points) "advantage player 1" else "advantage player 2"
  }

}
