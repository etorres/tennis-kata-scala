package es.eriktorr.katas.matchers

import es.eriktorr.katas.ScoreMatcher

object InvalidMatcher extends ScoreMatcher {

  override def matches(player1Points: Int, player2Points: Int): Boolean = false

  override def tennisScoreFrom(player1Points: Int, player2Points: Int): String = "invalid"

}
