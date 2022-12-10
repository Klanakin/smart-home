package smartdevice

class SmartHome(
    val smartTv: SmartTv,
    val smartLight: SmartLight
) {

    fun turnOnTv() {
        smartTv.turnOn()
    }

    fun turnOffTv() {
        smartTv.turnOff()
    }

    fun increseTvVolumn() {
        smartTv.increaseSpeakerVolumn()
    }

    fun changeTvChannelToNext() {
        smartTv.nextChannel()
    }

    fun turnOnLight() {
        smartLight.turnOn()
    }

    fun turnOffLight() {
        smartLight.turnOff()
    }

    fun increaseBrightness() {
        smartLight.increaseBrightnessLevel()
    }

    fun turnOffAllDevices() {
        smartTv.turnOff()
        smartLight.turnOff()
    }

}