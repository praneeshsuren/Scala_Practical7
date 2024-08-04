def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 until n).exists(i => n % i == 0)
}

def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(n => isPrime(n))
}

@main def main(): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(filterPrime(numbers).mkString("[", ", ", "]"))
}