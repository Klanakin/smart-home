package smartdevice

open class SmartDevice(val name: String = "Smart Device", val category: String = "Equipment" ) {

    var status = "online"
    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        when (statusCode) {
            0 -> {
                status = "offline"
                speakerVolume = 0
            }
            1 -> {
                status = "online"
                speakerVolume = 2
            }
            else -> status = "unknown"
        }
    }
    open fun turnOn() {
        println("Smart device is turned on.")
    }

    open fun turnOff() {
        println("smart device is turned off.")
    }

}