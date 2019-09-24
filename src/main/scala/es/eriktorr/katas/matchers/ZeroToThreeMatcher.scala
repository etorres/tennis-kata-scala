package es.eriktorr.katas.matchers

import es.eriktorr.katas.ScoreMatcher

object ZeroToThreeMatcher extends ScoreMatcher {

  override def matches(player1Points: Int, player2Points: Int): Boolean = {
    hasZeroToThreePoints(player1Points) && hasZeroToThreePoints(player2Points)
  }

  override def tennisScoreFrom(player1Points: Int, player2Points: Int): String = {
    s"${scoreFrom(player1Points)}-${scoreFrom(player2Points)}"
  }

  private def scoreFrom(playerPoints: Int) = playerPoints match {
    case 0 => "love"
    case 1 => "fifteen"
    case 2 => "thirty"
    case 3 => "forty"
    case _ => "invalid"
  }

  private def hasZeroToThreePoints(playerPoints: Int) = {
    playerPoints >= 0 && playerPoints <= 3
  }

}
