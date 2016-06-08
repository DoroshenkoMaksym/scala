def abs(x: Double) =
  if (x < 0) -x else x

def sqrt(x: Double) = {

  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else {
      sqrtIter(makeBetter(guess))
    }

  def isGoodEnough(guess: Double) =
    abs(guess * guess - x) / x <= 0.001

  def makeBetter(guess: Double) =
    (x / guess + guess) / 2

  sqrtIter(1.0)
}

sqrt(0.01e-20)