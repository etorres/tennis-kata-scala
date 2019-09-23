package es.eriktorr.katas.matchers

import es.eriktorr.katas.ScoreMatcher

object DeuceMatcher extends ScoreMatcher {

  override def matches(player1Points: Int, player2Points: Int): Boolean = {
    player1Points >= 3 && player2Points >= 3 && player1Points == player2Points
  }

  override def tennisScoreFrom(player1Points: Int, player2Points: Int): String = {
    "deuce"
  }

}
