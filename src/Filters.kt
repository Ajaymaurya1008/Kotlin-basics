fun main() {
//    val eager = decorations.filter { it[0] == 'p' }
//    println("eager:$eager")
//    val lazy = decorations.asSequence().filter{it[0] == 'p'}
//    println("lazy:$lazy")
//    println("lazy:${lazy.toList()}")

//    val lazyMap = decorations.asSequence().map{
//        println("access:$it")
//        it
//    }
//    println("lazy: $lazyMap")
//    println("-----")
//    println("first: ${lazyMap.first()}")
//    println("-----")
//    println("all: ${lazyMap.toList()}")
//
//    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
//        println("access: $it")
//        it
//    }
//    println("-----")
//    println("filtered: ${lazyMap2.toList()}")

    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)
    println(mylist)
    println("-----")
    println("Flat: ${mylist.flatten()}")



}

val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
