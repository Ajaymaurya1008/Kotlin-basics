fun main() {
    // lambdas or anonymous or arrow fun
    val waterFilter = { dirt: Int -> dirt / 2 }

    // normal function
    fun waterFilter2(dirt:Int):Int{
        return dirt/2
    }

    // Higher order function
    fun updateDirty(dirt:Int,operation:(Int)->Int):Int{
        return operation(dirt)
    }

    println(updateDirty(30,waterFilter)) // arrow functions are passed normally
    println(updateDirty(30,::waterFilter2)) // normal functions need double colon ::
}