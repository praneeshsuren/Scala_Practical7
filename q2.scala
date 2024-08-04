def calculateSquare(integers: List[Int]): List[Int] = {
    integers.map(n => n * n)
}

@main def main2(): Unit = {

    val numbers = List(1, 2, 3, 4, 5)
    println(calculateSquare(numbers).mkString("[", ", ", "]"))

}