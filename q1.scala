def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(n => n % 2 == 0)
}

val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

@main def main(): Unit = {
    println(filterEvenNumbers(numbers).mkString("[", ", ", "]"))
}