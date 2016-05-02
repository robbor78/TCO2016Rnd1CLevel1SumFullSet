class FullSumSetSpec extends BaseSpec {

  "SumFullSet" should "return closed for list 1" in {
    assertResult("closed") {
      SumFullSet.isFullSumSet(Array(-1, 0, 1))
    }
  }


  "SumFullSet" should "return not closed for list 2" in {
    assertResult("not closed") {
      SumFullSet.isFullSumSet(Array(-1, 1))
    }
  }

  "SumFullSet" should "return not closed for list 3" in {
    assertResult("closed") {
      SumFullSet.isFullSumSet(Array(0, 1))
    }
  }
}
