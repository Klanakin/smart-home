package smartdevice

class SmartLight(name: String, category: String): SmartDevice(name = name, category = category) {

    override val deviceType = "Smart Light"

    var brightnessLevel by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

//    private var brightnessLevel: Int = 0
//        private set(value) {
//            if (value in 0..100) {
//                field = value
//            }
//        }

    fun increaseBrightnessLevel() {
        brightnessLevel++
        println("Brightness level increased to $brightnessLevel.")
    }

    override fun turnOn() {
        super.turnOn()
        this.brightnessLevel = 2
        println("$name is turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        this.brightnessLevel = 0
        println("Smart Light turned off")
    }

}