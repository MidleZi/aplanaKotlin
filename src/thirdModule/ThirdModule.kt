package thirdModule

import kotlin.math.sqrt

/**
     Напишите функцию, которая получает в параметры какой-либо год,
     проверяет високосный ли это год и возвращает результат проверки.
 */
fun task12(year: Int): Boolean {
    var isLeap =  (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))
    if(isLeap) {
        println("Год високосный")
    } else {
        println("Год не високосный")
    }
    return isLeap
}

/**
    Напишите функцию, принимающую на вход имена сотрудников и возвращающую их количество.
    Используйте для этого vararg, из предыдущей темы.
 */
fun task13(vararg strings: String): Int{
    println("Всего имен: ${strings.size}")
    return strings.size
}

/**
    Напишите функцию, которая выводит в консоль информацию сотрудника (ФИО, Возраст, Должность и Семейное положение).
    С помощью перезагрузки функции, сделайте варианты, когда известны только:
    - ФИО и Должность
    - ФИО, Возраст и Должность
    - ФИО, Семейное положение и Должность
    - ФИО, Возраст, Семейное положение и Должность
*/
fun task14(fio: String, position: String){
    println("Сотрудник $fio занимает должность $position")
}
fun task14(fio: String, age: Int, position: String){
    println("Сотрудник $fio, возраст $age, занимает должность $position")
}
fun task14(fio: String, maried: String, position: String){
    println("Сотрудник $fio, $maried, занимает должность $position")
}
fun task14(fio: String, age: Int, maried: String, position: String){
    println("Сотрудник $fio, $maried, возраст $age, занимает должность $position")
}

/**
    Создайте переменную, которая содержит лямбда выражение для вывода в консоль данных массива типа String.
 */
fun task15() {
    var arrayString = {array: Array<String> ->
        for(string in array){
            println(string)
        }
    }
    arrayString(arrayOf("String", "String", "String"))

}

/**
    Напишите функцию для переменных типа Double, возвращающую корень числа
*/

fun Double.task16(): Double{
    var sqrt: Double = sqrt(this)
    println(sqrt)
    return sqrt
}

