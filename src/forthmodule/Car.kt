package forthmodule

/** Задание 23: Data class
    Создайте data класс для автомобилей. Он должен содержать марку автомобиля, цвет и номер.
    Выведите информацию об автомобилях в консоль.
 */
data class Car(private val brand: String, private var color: String, private val vin: String) {

    fun info() {
        println("Автомобиль марки: $brand\n Цвет: $color\n Серийный номер: $vin")
        //проверка
        println(this.toString())
    }
}