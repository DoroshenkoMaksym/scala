def abs(x: Double) =
  if (x < 0) -x else x

def sqrt(x: Double) = {

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else {
      sqrtIter(makeBetter(guess, x), x)
    }

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x <= 0.001

  def makeBetter(guess: Double, x: Double) =
    (x / guess + guess) / 2

  sqrtIter(1.0, x)
}

sqrt(0.01e-20)