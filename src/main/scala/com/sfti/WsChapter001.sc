object Chapter001 {
  def signum(x: Int): Int =
    if (x == 0) 0 else if (x > 0) 1 else -1

  def loop() {
    for(i <- 0 to 10) {
      println(i)
    }
  }

  def countdown(n: Int) {
    for(i <- n to 0 by -1) {
      println(i)
    }
  }

  def product1(letters: String): Long = {
    var acc: Long = 1
    for(i <- letters) {
      acc *= i
    }
    acc
  }

  def product2(letters: String): Long = {
    letters.foldLeft(1L)(_ * _.toInt)
  }

  def product3(letters: String) : Long = {
    if (!letters.isEmpty)
      letters.head * product3(letters.tail)
    else 1L
  }

  def pow(x: Double, n: Int) : Double = {
    if (n == 0) 1.0
    else if (n < 0) 1 / pow(x, -n)
         else if (n % 2 == 1) x * pow(x, n - 1)
              else pow(x, n/2) * pow(x, n/2)
  }

  signum(1)
  signum(-2)
  countdown(20)
  product1("Hello")
  product2("Hello")
  product3("Hello")
  pow(2,3)
}