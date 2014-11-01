package com.sfti

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

	def unicodeProduct(letters: String): Long = {
		var acc: Long = 1
		for(i <- letters) {
			acc *= i
		}
		acc
	}

	def product2(letters: String): Long = {
		letters.foldLeft(1)(_ * _.toInt)
	}

	def product3(letters: String) : Long = {
		if (!letters.isEmpty) 
			letters.head * product3(letters.tail)
		else 1L
	}
}
