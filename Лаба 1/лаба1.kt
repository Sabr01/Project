// Лаба 1 задача
fun main() {
    // тут я присвоил значения
    val a = 10

       val b = 5

    // (сложение, вычитание, умножение, деление)
    val sum = a + b

           val difference = a - b

        val product = a * b
    val quotient = a.toDouble() / b.toDouble() // деление, чтобы результат был с плавающей точкой

    // тут результаты
    println("Сумма: $sum")
       println("Разность: $difference")
     println("Произведение: $product")
    println("Частное: $quotient")

    // сравниваем
    println("a равно b: ${a == b}")
     println("a не равно b: ${a != b}")
    println("a больше b: ${a > b}")
    println("a меньше b: ${a < b}")
    println("a больше или равно b: ${a >= b}")
       println("a меньше или равно b: ${a <= b}")


}

