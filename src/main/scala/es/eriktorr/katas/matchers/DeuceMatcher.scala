package es.eriktorr.katas.matchers

import es.eriktorr.katas.ScoreMatcher

object DeuceMatcher extends ScoreMatcher {

  override def matches(player1Points: Int, player2Points: Int): Boolean = {
    hasAtLeastThreePoints(player1Points) && hasAtLeastThreePoints(player2Points) &&
      scoresAreEqual(player1Points, player2Points)
  }

  override def tennisScoreFrom(player1Points: Int, player2Points: Int): String = {
    "deuce"
  }

  private def scoresAreEqual(player1Points: Int, player2Points: Int) = {
    player1Points == player2Points
  }

  private def hasAtLeastThreePoints(player1Points: Int) = {
    player1Points >= 3
  }

}
