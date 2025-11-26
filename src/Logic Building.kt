fun evenOrOdd(n:Int){
    val rem = n % 2

    if (rem == 0){
        println("$n is even")
    } else {
        println("$n is odd")
    }

}

fun multiTable(){

    println("Enter The Number: ")
    val n = readln().toInt()

    for (i in 1..10){
        println("$n  *  $i  = ${i*n}")
    }


}


fun sumOfNaturals(){

    println("Enter A number: ")
    val num = readln().toInt()
    var sum = 0
    for (i in 1 .. num){
        sum += i
    }
    println("$sum")

}