package forthmodule

class PassengerBoard(override var passengers: Int, number: String, maxDistance: Int, fuelTankVolume: Double): Aircraft(number, maxDistance, fuelTankVolume), Passengers {

    override fun aboutBoard() {
        super.aboutBoard()
        println("Пассажировместительность самолета $passengers человек")
    }
}