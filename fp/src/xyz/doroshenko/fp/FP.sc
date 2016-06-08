def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else {
    sqrtIter(makeBetter(guess, x), x)
  }


def isGoodEnough(guess: Double, x: Double) =
  abs(guess * guess - x) < 0.001


def abs(x: Double) =
  if (x < 0) -x else x

def makeBetter(guess: Double, x: Double) =
  (x / guess + guess) / 2

def sqrt(x: Double) = sqrtIter(1.0, x)


sqrt(1.0e5)