//2 задача 1 лабы
fun main() {
    // Запрашиваем у пользователя ввод числа
    print("Введите число: ")


    val userInput = readLine()?.toIntOrNull()


    if (userInput != null) {

        if (userInput % 2 == 0) {
            println("Введенное число $userInput четное.")
        } else {
            println("Введенное число $userInput нечетное.")
        }
    } else {
        println("Ошибка")
    }
}
