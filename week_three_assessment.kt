fun main(args: Array<String>) {
    assessment()
}
fun assessment(){
    /*This code outputs multiples of 3 and 5
    as fizz, buzz and then outputs multiples of 3 & 5 together as FizzBuzz*/
    for(numbs in 1..100){
        if(numbs % 3 == 0 && numbs % 5 == 0){
            println("FizzBuzz")
            continue
        }
        if(numbs % 3 == 0){
            println("Fizz")
            continue
        }
        if(numbs % 5 == 0){
            println("Buzz")
            continue
        }
        println(numbs)
    }
    //This code outputs the name in reverse
    var name: String = "Good Food"
    var length: Int = name.length-1
    for (index in name.indices){
        print(name[length-index])
        }
}

