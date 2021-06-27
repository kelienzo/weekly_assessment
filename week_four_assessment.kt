fun main() {
    //Evenly spaced function called
    println(evenlySpaced(8, 6, 4))
}

//This function returns true if the numbers are evenly spaced
fun evenlySpaced(a: Int, b: Int, c: Int): Boolean {
    var firstCalc: Int = a - b
    var secondCalc: Int = b - c
    return firstCalc == secondCalc
}
