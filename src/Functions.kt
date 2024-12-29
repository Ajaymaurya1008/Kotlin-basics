import java.util.*


fun main(args: Array<String>) {
//    println("Hello, ${args[0]}")
//    val isUnit = println("This is an expression")
//    println(isUnit)
//
//    val temp = 10
//    val isHot = if (temp > 40) true else false
//    println(isHot)
//    val message = "the temp is ${if (temp > 40) "too hot" else "OK"}"
//    println(message)
//    swim("slow")
//    swim()
//    swim(speed = "faster")
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = getFood(day)
    println("today is $day and food is $food")
    println("water should change ? ${shouldChangeWater(day)}")
}

fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun getFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pentas"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun swim(speed: String = "fast") {
    println("Swimming Speed is: $speed")
}

fun isToHot(temp:Int) = temp>30
fun isSunday(day:String) = day=="Sunday"
fun isDirty(dirt:Int) = dirt>30

fun shouldChangeWater(day: String, temp: Int = 20, dirt: Int = 18): Boolean {
    return when {
        isSunday(day) -> true
        isToHot(temp) -> true
        isDirty(dirt) -> true
        else -> false
    }
}



