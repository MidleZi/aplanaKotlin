fun main(args: Array<String>) {
    //Задание 1
    task1()
    //Задание 2
    task2()
    //Задание 3
    task3()
    //Задание 4
    task4()
    //Задание 5
    task5()
    //Задание 6
    task6()
}


/**
1) Создайте переменную со значением null типа Any?
2) Переопределите значение ранее созданной переменной на любую цифру
3) Создайте переменную, не указывая её тип и присвойте ей значение из ранее созданной переменной деленную на 2,5
4) Напишите в комментарии какого типа последняя переменная
 */
fun task1() {
    println("Task 1:")
    //1) Создайте переменную со значением null типа Any?
    var any: Any? = null
    //2) Переопределите значение ранее созданной переменной на любую цифру
    any = 1
    //3) Создайте переменную, не указывая её тип и присвойте ей значение из ранее созданной переменной деленную на 2,5
    var newVar = any / 2.5
    //4) Напишите в комментарии какого типа последняя переменная
    //переменная newVar типа Double
    //проверки:
    println("any: " + any)
    println("newVar: " + newVar)
    println(newVar is Double)
    println()
}

/**
Создайте две переменные типа String, содержащие "hello" и "aplana"
И выведите их в консоль так что бы получилось: hello aplana
 */
fun task2() {
    println("Task 2:")
    var hello: String = "hello"
    var aplana: String = "aplana"
    println("$hello $aplana")
    println()
}

/**
Преобразуйте  var five: Char = '5' в String, Byte, Short, Int, Double, FLoat и Long
 */
fun task3() {
    println("Task 3:")
    var five: Char = '5'
    println("five is String: " + (five.toString() is String))
    println("five is Byte: " + (five.toByte() is Byte))
    println("five is Short: " + (five.toShort() is Short))
    println("five is Int: " + (five.toInt() is Int))
    println("five is Double: " + (five.toDouble() is Double))
    println("five is Float: " + (five.toFloat() is Float))
    println("five is Long: " + (five.toLong() is Long))
    println()
}

/**
Напишите программу, запрашивающую имя пользователя и выводящую приветствие пользователя в консоль, после ввода имени.
 */
fun task4() {
    println("Task 4:")
    // Запрашиваем у пользователя текст
    println("Напишите Ваше имя:")
    // Сохраняем текст в переменную с именем userText типа 'String?'
    var userName: String? = readLine()
    // Сохраняем в переменной stringText типа 'String' значение из переменной userText изменяя тип. Для множества операций тип 'String?' не подойдет.
    var stringText: String = userName.toString()
    // Выводим значение stringText в консоль
    println("Привет: $stringText!")
    println()
}

/**
Создайте переменную, содержащую последовательность английского алфавита наоборот – начиная с последней буквы алфавита и заканчивая первой буквой.
 */
fun task5() {
    println("Task 5:")
    var alphabet = 'z' downTo 'a'
    for (letter in alphabet) {
        println("Буква: $letter")
    }
    println()
}

/**Напишите программу, которая запрашивает у пользователя два числа в переменные “a” и “b”.
 * Проверьте больше ли "a" чем "b" и получите результат в виде переменой типа boolean.*/
fun task6() {
    println("Task 6:")
    var firstnum: Int = 0
    var secondnum: Int = 0
    var isNumericFirstNum = false
    var isNumericSecondNum = false
    // Запрашиваем у пользователя текст
    println("Введите первое число:")

    while (!isNumericFirstNum) {
        try {
            var a: String? = readLine()
            firstnum = a.toString().toInt()
            isNumericFirstNum = true
        } catch (e: NumberFormatException) {
            println("Вы ввели не число, попробуйте еще раз")
            isNumericFirstNum = false
        }
    }
    var isNumeric = false
    println("Введите второе число:")
    while (!isNumericSecondNum) {
        try {
            var b: String? = readLine()
            secondnum = b.toString().toInt()
            isNumericSecondNum = true
        } catch (e: NumberFormatException) {
            println("Вы ввели не число, попробуйте еще раз")
            isNumericSecondNum = false
        }
    }
    if (firstnum > secondnum) {
        print("Первое число больше второго")
    } else if (firstnum < secondnum) {
        print("Первое число меньше второго")
    } else {
        print("Числа равны!")
    }
    println()
}

    
