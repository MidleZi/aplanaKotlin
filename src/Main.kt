import firstmodule.*
import forthmodule.*
import secondmodule.*
import thirdModule.*
import java.lang.NumberFormatException

fun main(args: Array<String>) {
//    //Задание 1
//    task1()
//    //Задание 2
//    task2()
//    //Задание 3
//    task3()
//    //Задание 4
//    task4()
//    //Задание 5
//    task5()
//    //Задание 6
//    task6()
//    //Задание 7
//    task7()
//    //Задание 8
//    task8()
//    //Задание 9
//    task9()
//    //Задание 10
//    task10()
//    //Задание 11
//    task11()
//    //Задание 12
//    task12(2020)
//    //Задание 13
//    task13("Уасилий", "Леопольд", "Матроскин")
//    //Задание 14
//    task14("Пупкин Василий Петрович", "Механик")
//    task14("Пупкин Василий Петрович", 45, "Механик")
//    task14("Пупкин Василий Петрович", "Разведен", "Механик")
//    task14("Пупкин Василий Петрович", 45, "Разведен", "Механик")
//    //Задание 15
//    task15()
//    //Задание 16
//    task16(25.0)
    task24()

}



/** Задание 24: Итоговое задание
    1.Создайте в программе для авиакомпании еще пару классов, описывающих различные модели самолетов.
    Сделайте один из них грузовым, для этого создайте соответствующий интерфейс со свойством грузоподъёмность.
    2.В классе main используйте какую либо коллекцию для хранения информации об имеющихся самолетах у авиакомпании.
    Добавьте в эту коллекцию несколько самолетов используя имеющиеся классы моделей самолетов.
    3.Напишите интерфейс для пользователя, где пользователь может в консоли запрашивать информацию о самолетах авиакомпании.
    Интерфейс должен отображать список команд, а пользователь в свою очередь выбирает номер команды.
*/

    var airBoards: MutableMap<String, Aircraft> =
        mutableMapOf("N201" to Boeing747(), "N215" to SuperJet(), "N210" to A320(), "N777" to An225())
    fun getAllBoards() {
        for (board in airBoards) {
            println("В ангаре имеется самолет со следующими данными:")
            println(board.value.aboutBoard())
            println()
        }
    }
    fun addBoard() {
        println("Введите номер самолета")
        var boardNum: String = readLine().toString()
        println("Введите дальность полета самолета")
        var maxDistance: String = readLine().toString()
        println("Введите объем бака самолета")
        var fuelTankVolume: String = readLine().toString()
        println("Введите кол-во посадочных мест самолета")
        var passenger: String = readLine().toString()
        println("Введите грузоподъемность самолета")
        println("Если самолет пассажирский, ничего не вводите")
        var capacity: String = readLine().toString()
        try {
            if (capacity == "") {
                airBoards.put(
                    boardNum,
                    PassengerBoard(passenger.toInt(), boardNum, maxDistance.toInt(), fuelTankVolume.toDouble())
                )
                println("Добавлен пассажирский самолет")
            } else {
                airBoards.put(
                    boardNum,
                    CargoAirplane(
                        passenger.toInt(),
                        capacity.toDouble(),
                        boardNum,
                        maxDistance.toInt(),
                        fuelTankVolume.toDouble()
                    )
                )
                println("Добавлен грузовой самолет")
            }
        } catch (ex: NumberFormatException) {
            println("Дальность полета, объем бака, кол-во посадочных мест и грузоподъемность могут быть выражены только числами\nСамолет не добавлен\n")
        }

    }
    fun deleteBoard(){
        println("Введите номер самолета, чтобы его списать")
        var boardNum: String = readLine().toString()
        if(airBoards.containsKey(boardNum)) {
        airBoards.remove(boardNum)
        println("Запись удалена")
        } else {
            println("Самолета с номером $boardNum нет в ангаре")
        }
    }
    fun task24() {
        var isWork = true;
        while (isWork) {
            println("""Чтобы получить информацию о самолетах в ангарах, введите команд "boards"""")
            println("""Чтобы добавить самолет, введите команду "add"""")
            println("""Чтобы списать самолет, введите команду "del"""")
            println("Закончить работу - #quit")
            var command: String = readLine().toString()
            when (command) {
                "add" -> {
                    addBoard()
                }
                "boards" -> {
                    getAllBoards()
                }
                "del" -> {
                    deleteBoard()
                }
                "#quit" -> {
                    isWork = false
                }
                else -> {
                    println("Команды $command не существует")
                }
            }
        }

    }