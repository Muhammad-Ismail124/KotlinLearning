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

fun squareOfNaturals(){
    println("Enter A number: ")
    val num = readln().toInt()

    var sum = 0
    for (i in 1 .. num){
        sum += (i*i)
    }
print("$sum")
}


fun swapTwoNum(){

    println("Enter A number: ")
    var num1 =  readln().toInt()
    println("Enter Another Number:")
    var num2 = readln().toInt()
   println("First Place:$num1   Second Place: $num2  ")
    val temp = num1
    num1 = num2
    num2 = temp

    println("First Place: $num1   Second Place:  $num2  Boom Numbers Swapped Magic ")
}

    fun oppositeOfFaceDice() {

    println("Enter A Number to check on the dice: ")
    var ans = readln().toInt()

    if (ans == 1) {
        ans = 6
        println("In a normal 6-faced dice 1 is opposite to 6 hence answer is $ans")
    } else if (ans == 2) {
        ans = 5
        println("In a normal 6-faced dice 2 is opposite to 5 hence answer is $ans")
    } else if (ans == 3) {
        ans = 4
        println("In a normal 6-faced dice 3 is opposite to 4 hence answer is $ans")
    } else if (ans == 4) {
        ans = 3
        println("In a normal 6-faced dice 4 is opposite to 3 hence answer is $ans")
    } else if (ans == 5){
        ans = 2
        println("In a normal 6-faced dice 5 is opposite to 2 hence answer is $ans")
    }else {
        ans = 1
    }
}

fun nthTermFromFirstTwoterms(a1: Int,a2: Int,n: Int): Int{

    return (a1 +(n-1)* (a2-a1))

}