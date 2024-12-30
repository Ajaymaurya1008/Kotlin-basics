package example.myapp

fun main(){
    buildAquarium()
}

fun buildAquarium(){
//    val aquarium1 = Aquarium()
//    aquarium1.printSize()
//    val aquarium2 = Aquarium(width=25)
//    aquarium2.printSize()
//    val aquarium3 = Aquarium(height=60,length=90)
//    aquarium3.printSize()
//    val aquarium4 =Aquarium(width=30, height=50,length=110)
//    aquarium4.printSize()

//    val aquarium5 = Aquarium(numberOfFish = 25)
//    aquarium5.printSize()
//    aquarium5.volume = 70
//    aquarium5.printSize()

//    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
//    aquarium6.printSize()

    val myAquarium = Aquarium(length = 25, width = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(height = 40, diameter = 25)
    myTower.printSize()
}

