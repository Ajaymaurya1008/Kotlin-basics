package example.myapp.decor

fun String.hasSpaces(): Boolean {
    val found = this.indexOf(' ')
    // also valid: this.indexOf(" ")
    // returns positive number index in String or -1 if not found
    return found != -1
}

fun String.hasSpaces2() = indexOf(" ") != -1


fun main(){
    val str = "vhjhhhjbhjbh"
    println(str.hasSpaces())

    open class AquariumPlant(val color: String, private val size: Int)

    class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

    fun AquariumPlant.print() = println("AquariumPlant")
    fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

    val plant = GreenLeafyPlant(size = 10)
    plant.print()
    println("\n")
    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print()

}
