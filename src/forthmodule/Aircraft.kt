package forthmodule



/** Задание 17: Авиакомпания 1
    Поможем авиакомпании в создании программы для учета авиапарка.
    Создайте класс Aircraft и реализуйте в нем свойства, содержащие следующее:
    номер воздушного судна, максимальная дальность полета, вместимость бака, расход топлива на 100 км.
    Установите значения по своему усмотрению.
    Переопределите геттер свойства содержащего расход топлива,
    чтобы он самостоятельно рассчитывался из свойств дальности полета и вместимости бака.
 */
//class Aircraft {
//    val number: String = ""
//    var maxDistance: Int = 2500
//    var fuelTankVolume: Double = 2
//    var fuelConsumption: Int = maxDistance/fuelTankVolume
//}

/** Задание 18: Авиакомпания 2. Конструктор
    Усовершенствуйте программу для авиакомпании. Пусть свойства: номер воздушного судна,
    максимальная дальность полета и вместимость бака определяются через конструктор.
    Для этих свойств значения определять не надо.

 */
//class Aircraft(var number: String, var maxDistance: Int, var  fuelTankVolume: Double) {
//    var fuelConsumption: Int = maxDistance/fuelTankVolume
//}

/** Задание 19: Авиакомпания 3. Наследование
    Создадим наследника класса Aircraft с названием Boeing747 и добавим ему свойство, обозначающее вместимость пассажиров
 */
//open class Aircraft(var number: String, var maxDistance: Int, var  fuelTankVolume: Double) {
//    var fuelConsumption: Int = maxDistance/fuelTankVolume
//}


/** Задание 21: Авиакомпания 5. Абстрактный класс
    Усовершенствуем программу так, чтобы нельзя было создать неопределенный тип самолета: сделайте класс Aircraft абстрактным.
*/
//open abstract class Aircraft(var number: String, var maxDistance: Int, var  fuelTankVolume: Double) {
//    var fuelConsumption: Int = maxDistance/fuelTankVolume
//}
/** Задание 22: Авиакомпания 6. Вывод информации
    1. Создайте в классе Aircraft функцию для вывода характеристик самолетов в консоль.
    2. Переопределите данную функцию в классе Boeing747, так чтобы еще выводилась информация о пассажирах
    3. Сделайте свойства обоих классов видимыми только внутри этих классов и их наследниках,
    кроме свойства наследуемого от интерфейса.
    Свойства и функции интерфейсов не поддерживают модификатор protected и internal
*/
open abstract class Aircraft(private var number: String, private var maxDistance: Int, private var  fuelTankVolume: Double) {
    var fuelConsumption: Double = maxDistance/fuelTankVolume

    open fun aboutBoard() {
        println("Борт $number имеет на борту $fuelTankVolume тонн топлива и може пролететь ${maxDistance}км, имея при этом средний расход $fuelConsumption тонн/тыс.км")
    }

}