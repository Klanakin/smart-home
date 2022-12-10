package smartdevice

class SmartLight(name: String, category: String): SmartDevice(name = name, category = category) {

    private var brightnessLevel: Int = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    fun increaseBrightnessLevel() {
        brightnessLevel++
        println("Brightness level increased to $brightnessLevel.")
    }

    override fun turnOn() {
        super.status = "on"
        this.brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.status = "off"
        this.brightnessLevel = 0
        println("Smart Light turned off")
    }

}