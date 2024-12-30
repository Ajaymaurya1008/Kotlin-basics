package example.myapp

import kotlin.math.PI

open class Aquarium(open var width: Int = 20, open var height: Int = 40, open var length: Int = 100) {

    init {
        println("Aquarium initializing ...")
    }

//    init{
//        // 1 litre = 1000cm^3
//        println("volume : ${length*width*height/1000} litres")
//    }

    constructor(numberOfFish: Int) : this() {
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (width * length)).toInt()
    }

    fun printSize() {
        println(
            "Width : $width cm " +
                    "Height : $height cm " +
                    "Length : $length cm"
        )
        println("Volume : $volume litres")

        println("Volume : $volume litres ,Water : $water litres ${(water / volume) * 100.0}% full")
    }

    open var volume: Int
        get() = width * height * length / 1000 // 1cm^3 = 1000 litres
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9
}

class TowerTank(override var height: Int, var diameter: Int) :
    Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        // volume of cylinder =  π*r*r*h
        get() = (width / 2 * width / 2 * height/1000 * PI).toInt()
        set(value) {
            height = (value*1000 / (PI * width / 2 * width / 2)).toInt()
        }

    override var water = volume * 0.8

    override var shape = "cylinder"
}