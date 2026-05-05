object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(56, 72, 15, 17, 5)
    assert(Policy.score(signalcase_1) == 84)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(83, 90, 25, 9, 4)
    assert(Policy.score(signalcase_2) == 173)
    assert(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(106, 98, 26, 14, 10)
    assert(Policy.score(signalcase_3) == 218)
    assert(Policy.classify(signalcase_3) == "accept")
  }
}
