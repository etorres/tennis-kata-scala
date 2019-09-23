package es.eriktorr.katas

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{FlatSpec, Matchers}

class TennisScoreCalculatorAcceptance extends FlatSpec with Matchers with TableDrivenPropertyChecks {

  private val pointsPlayed = Table(
    ("player1Points", "player2Points", "score"),
    (3, 3, "deuce"))
//    (0, 15, "love-fifteen"))

  "Tennis score calculator" should "convert two integer to a tennis-style score" in {
    val tennisScoreCalculator = new TennisScoreCalculator

    forAll(pointsPlayed) { (player1Points, player2Points, score) =>
      tennisScoreCalculator.score(player1Points, player2Points) should be (score)
    }
  }

}
