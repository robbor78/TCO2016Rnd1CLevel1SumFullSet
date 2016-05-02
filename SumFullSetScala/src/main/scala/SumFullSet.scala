object SumFullSet {

  private val Closed = "closed"
  private val NotClosed = "not closed"

  def isFullSumSet(elements: Array[Int]): String = {

    if (elements.combinations(2).map(x => (x(0) + x(1))).max > elements.max) NotClosed else Closed


  }

}
