package forthmodule


/** Задание 24: Итоговое задание
    1.Создайте в программе для авиакомпании еще пару классов, описывающих различные модели самолетов.
    Сделайте один из них грузовым, для этого создайте соответствующий интерфейс со свойством грузоподъёмность.
    2.В классе main используйте какую либо коллекцию для хранения информации об имеющихся самолетах у авиакомпании.
    Добавьте в эту коллекцию несколько самолетов используя имеющиеся классы моделей самолетов.
    3.Напишите интерфейс для пользователя, где пользователь может в консоли запрашивать информацию о самолетах авиакомпании.
    Интерфейс должен отображать список команд, а пользователь в свою очередь выбирает номер команды.
 */
class An225(override var passengers: Int = 20, override var capacity: Double = 2500.0): Aircraft("N777",6000 , 10.0), Passengers, СarryingСapacity {

    override fun aboutBoard() {
        super.aboutBoard()
        println("Пассажировместительность самолета $passengers человек и грузоподъемность $capacity тонн")
    }
}