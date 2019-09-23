package es.eriktorr.katas

trait ScoreMatcher {

  def matches(player1Points: Int, player2Points: Int): Boolean

  def tennisScoreFrom(player1Points: Int, player2Points: Int): String

}
