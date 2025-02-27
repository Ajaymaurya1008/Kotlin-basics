package Unit3

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double,
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
//    cookies.forEach({println("Menu item is ${it.name}")})

//    val fullMenu = cookies.map{ "${it.name} - ${it.price}" }
//    fullMenu.forEach{println(it)}

//    val softBakedCookies = cookies.filter{it.softBaked}
//    softBakedCookies.forEach{println("${it.name} - ${it.price}")}

//    val groupedCookies = cookies.groupBy{it.softBaked}
//    val crunchyCookies = groupedCookies[false] ?: listOf()
//    crunchyCookies.forEach{ println("${it.name} - ${it.price}") }

//    Accumulator
//    Current Value
//    val totalPrice = cookies.fold(0.0) { a, c -> a + c.price }
//    println(totalPrice)

//    val alphabeticalMenu = cookies.sortedBy { it.name }
//    alphabeticalMenu.forEach { println(it.name) }
    val sortedMenuItems = cookies.sortedBy{ it.price }
    sortedMenuItems.forEach { println("${it.name} - ${it.price}") }

}