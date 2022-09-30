class Vehicle {
    inner class Engine {
        fun start() {
            println("RRRrrrrrrr....")
        }
    }
}
// do not touch the class above

fun main() {
    val vehicle: Vehicle = Vehicle()
    val engine: Vehicle.Engine = vehicle.Engine()

    engine.start()
}