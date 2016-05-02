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



  "SumFullSet" should "return not closed for list 4" in {
    assertResult("not closed") {
      SumFullSet.isFullSumSet(Array(0, 1, 1))
    }
  }

  "SumFullSet" should "return not closed for list 5" in {
    assertResult("not closed") {
      SumFullSet.isFullSumSet(Array(16, 0, 43, 43, -36, -49, -46, -16, 40, 34, -43, -24, 13, -48, 45, 19, 12, 0, 43, 6, 26, -23, 50, 28, -3, 21, 46, 45, -32, -41, 0, -27, 42, 19, 47, -36, -21, -1, 5, -21, -28, -43, 23, -26, -5, 21, -41, 16, -37, 38))
    }
  }

  "SumFullSet" should "return not closed for list 6" in {
    assertResult("closed") {
      SumFullSet.isFullSumSet(Array(10))
    }
  }
}
