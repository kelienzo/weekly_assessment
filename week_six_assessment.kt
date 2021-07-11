fun main() {
    println(inLove(4, 3))
}

fun inLove(evenPetals: Int, oddPetals: Int): Boolean{
    var firstFlower = evenPetals % 2 == 0
    var secondFlower = oddPetals % 2 == 1
    return firstFlower == secondFlower
}
