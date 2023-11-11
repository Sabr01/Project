//3 задача 1 лабы А)
fun main() {
    val number = 5

    println("Таблица умножения для $number:")

    for (i in 1..10) {
        val result = number * i
        println("$number * $i = $result")
    }
}
/*
//3 задача 1 лабы Б)
fun main() {
    var userInput: Int?

    do {
        print("Введите число (введите 0 для выхода): ")
        userInput = readLine()?.toIntOrNull()

        if (userInput != null && userInput != 0) {
            val square = userInput * userInput
            println("Квадрат числа $userInput: $square")
        } else if (userInput != 0) {
            println("Некорректный ввод. Пожалуйста, введите целое число.")
        }
    } while (userInput != 0)

    println("Программа завершена.")
}
*/