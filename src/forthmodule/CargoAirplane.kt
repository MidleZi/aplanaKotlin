package forthmodule

class CargoAirplane (override var passengers: Int, override var capacity: Double, number: String, maxDistance: Int, fuelTankVolume: Double): Aircraft(number, maxDistance, fuelTankVolume), Passengers, СarryingСapacity {
    override fun aboutBoard() {
        super.aboutBoard()
        println("Пассажировместительность самолета $passengers человек и грузоподъемность $capacity тонн")
    }
}