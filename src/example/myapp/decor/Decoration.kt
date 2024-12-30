package example.myapp.decor

data class Decoration(val rocks: String) {
}

data class Decoration2(val rocks: String, val wood: String, val diver: String) {
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Direction(val degrees: Int) {
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270)
}

fun makeDecorations() {
//    val decoration1 = Decoration("granite")
//    println(decoration1)
//
//    val decoration2 = Decoration("slate")
//    println(decoration2)
//
//    val decoration3 = Decoration("slate")
//    println(decoration3)
//
//    println(decoration1.equals(decoration2))
//    println(decoration2.equals(decoration3))

//    val d5 = Decoration2("crystal","wood","diver")
//    println(d5)
//
//    val (rock,_,diver) = d5
//    println(rock)
//    println(diver)

//    println(Color.RED)
//    println(Color.RED.rgb)
//
//    println(Direction.SOUTH)
//    println(Direction.NORTH.name)
//    println(Direction.EAST.degrees)
//    println(Direction.WEST.ordinal)
}

class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name: String) = println("My favourite $name")
    }
}

fun main() {
//    makeDecorations()
//    println(Choice.name)
//    Choice.showDescription("pick")
//    Choice.showDescription("Selection")

    // Pairs
//    val equipment = "first" to "second"
//    val (f, s) = equipment
//    println("$f $s")
//    println(equipment)
//    println(equipment.first)
//    println(equipment.second)

    // triple
//    var tryo = Triple(1, 2, 3)
//    println(tryo.first)
//    println(tryo.second)
//    println(tryo.third)
//    println(tryo)
//    println(tryo.toString())
//    println(tryo.toList())

    // list
//    var list = listOf(1,2,3)
//    for(item in list.listIterator()){
//        println(item)
//    }
//    var mlist = mutableListOf(1,2,3)
//    mlist.remove(3)

    // Hashmap

//    val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
//    println(scientific.get("catfish"))
//    println(scientific.get("catfishh"))
//    println(scientific.getOrDefault("catfishh", "sorry, I don't know"))
//    var myMap = mutableMapOf<String, Int>("first" to 1, "second" to 2)
//    myMap["catfish"] = 3
//    println(myMap)
//    myMap.put("hello",4)
//    println(myMap)

    fun hello(){
        println("hello")
    }

    // val -> run time check
    // const val -> compile time check
//    val value1 = hello() // OK
//    const val CONSTANT1 = hello() // NOT ok





}