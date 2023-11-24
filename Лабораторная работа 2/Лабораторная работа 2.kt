/*Лабораторная работа 2 - 1 задача 1.2
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val number1 = 5
    val number2 = 7

    val result = sum(number1, number2)

    println("Сумма чисел $number1 и $number2 равна $result")
}
*/
/*1 задача 1.3
fun multiply(a: Int, b: Int, c: Int): Int {
    return a * b * c
}

fun main() {
    val number1 = 4
    val number2 = 3
    val number3 = 5

    val result = multiply(number1, number2, number3)

    println("Произведение чисел $number1, $number2 и $number3 равно $result")
}
*/
/* 1 задача 1.4
fun greet(userName: String) {
    println("Привет, $userName! Добро пожаловать!")
}

fun main() {
    val userName = "Sabr" // Замените на нужное имя пользователя
    greet(userName)
}
*/
/* 2 задача 2.1
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun main() {
    val intResult = sum(5, 8)
    val doubleResult = sum(3.5, 2.5)

    println("Сумма целых чисел: $intResult")
    println("Сумма чисел с плавающей точкой: $doubleResult")
}
*/
/*
fun multiply(a: Int, b: Int, c: Int): Int {
    return a * b * c
}

fun multiply(a: Double, b: Double, c: Double): Double {
    return a * b * c
}

fun main() {
    val intResult = multiply(2, 3, 4)
    val doubleResult = multiply(1.5, 2.5, 3.0)

    println("Произведение целых чисел: $intResult")
    println("Произведение чисел с плавающей точкой: $doubleResult")
}
*/
/* 3 задача */
class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int, c: Int): Int {
        return a * b * c
    }
}

fun main() {
    val calculator = Calculator()

    // Пример использования метода add
    val sumResult = calculator.add(6, 3)
    println("Сумма чисел: $sumResult")

    // Пример использования метода multiply
    val multiplyResult = calculator.multiply(2, 3, 6)
    println("Произведение чисел: $multiplyResult")
}
