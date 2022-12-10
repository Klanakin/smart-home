package smartdevice

class SmartHome(
    val smartTv: SmartTv,
    val smartLight: SmartLight
) {

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTv.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTv.turnOff()
    }

    fun increaseTvVolume() {
        smartTv.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTv.nextChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLight.turnOn()
    }

    fun turnOffLight() {
        smartLight.turnOff()
    }

    fun increaseLightBrightness() {
        smartLight.increaseBrightnessLevel()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }

}