package smartdevice

open class SmartDevice(val name: String = "Smart Device", val category: String = "Equipment" ) {

    var status = "online"
        protected set

    open val deviceType = "unknown"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        status = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    open fun turnOn() {
        status = "on"
    }

    open fun turnOff() {
        status = "off"
    }

}