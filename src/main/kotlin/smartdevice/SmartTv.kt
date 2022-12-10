package smartdevice

class SmartTv(name: String, category: String) : SmartDevice(name = name, category = category) {

    override val deviceType = "Smart TV"

    var speakerVolume by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

//    private var speakerVolume = 2
//        private set(value) {
//            if (value in 0..100) {
//                field = value
//            }
//        }
//
//    private var channelNumber = 1
//        private set(value) {
//            if (value in 0..200) {
//                field = value
//            }
//        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "${super.name} is turned on. Speaker volume is set to ${this.speakerVolume} and channel number is " +
                    "set to ${this.channelNumber}."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("${super.name} turned off")
    }

}