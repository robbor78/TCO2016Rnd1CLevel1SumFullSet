val elements = Array(-1, 0, 1)

elements zip elements


(for {x1 <- elements
      x2 <- elements} yield (x1, x2))
  .map(a => a._1 + a._2)

elements.combinations(2).map(x => (x(0) + x(1))).toList

elements.max

