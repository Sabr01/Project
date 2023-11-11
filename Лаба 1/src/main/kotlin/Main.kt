/*
//2 задание 1 лабы
fun main() {

    print("Введите число: ")

    // преобразуем введенное число
    val userInput = readLine()?.toIntOrNull()


    if (userInput != null) {

        if (userInput % 2 == 0) {
            println("Введенное число $userInput четное.")
        } else {
            println("Введенное число $userInput нечетное.")
        }
    } else {
        println("Ошибка Некорректный ввод.")
    }
}
*/
/*
//3 задача 1 лабы А) и Б)

fun main() {
    val number = 5

    println("Таблица умножения для $number:")

    for (i in 1..10) {
        val result = number * i
        println("$number * $i = $result")
    }
}
*/
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





