package smartdevice

class SmartTv(name: String, category: String) : SmartDevice(name = name, category = category) {

    var speakerVolumn = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    fun increaseSpeakerVolumn() {
        speakerVolumn++
        println("Speaker volumn increased to $speakerVolumn.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn() {
        println(super.status)
        println(
            "${super.name} is turned on. Speaker volume is set to ${this.speakerVolume} and channel number is " +
                    "set to ${this.channelNumber}."
        )
    }

    override fun turnOff() {
        super.status = "off"
        println("${super.name} turned off")
    }

}