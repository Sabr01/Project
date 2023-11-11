//1 задача 1 Лабы
fun main() {
    // Присваиваем значения двум переменным
    val a = 10
    val b = 5

    // Основные арифметические операции
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a.toDouble() / b.toDouble() // деление, чтобы результат был с плавающей точкой

    // Выводим результаты арифметических операций
    println("Сумма: $sum")
    println("Разность: $difference")
    println("Произведение: $product")
    println("Частное: $quotient")

    // Операторы сравнения
    println("a равно b: ${a == b}")
    println("a не равно b: ${a != b}")
    println("a больше b: ${a > b}")
    println("a меньше b: ${a < b}")
    println("a больше или равно b: ${a >= b}")
    println("a меньше или равно b: ${a <= b}")
}
