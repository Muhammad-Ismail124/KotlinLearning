import kotlin.math.sqrt

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
        when (ans) {
            1 -> {
                ans = 6
                println("In a normal 6-faced dice 1 is opposite to 6 hence answer is $ans")
            }
            2 -> {
                ans = 5
                println("In a normal 6-faced dice 2 is opposite to 5 hence answer is $ans")
            }
            3 -> {
                ans = 4
                println("In a normal 6-faced dice 3 is opposite to 4 hence answer is $ans")
            }
            4 -> {
                ans = 3
                println("In a normal 6-faced dice 4 is opposite to 3 hence answer is $ans")
            }
            5 -> {
                ans = 2
                println("In a normal 6-faced dice 5 is opposite to 2 hence answer is $ans")
            }
            else -> {
                ans = 1
                println("In a normal 6-faced dice 6 is opposite to 1 hence answer is $ans")
            }
        }
}

fun nthTermFromFirstTwoTerms(a1: Int, a2: Int, n: Int): Int{
    return (a1 +(n-1)* (a2-a1))

}

fun sumOfIntegers(){
    println("Enter some numbers: ")
    val nums = readln().toInt()
    val digits = nums.toString()
    var sum = 0
    for (i in digits){
        val digit = i.toString().toInt()
        sum = sum + digit
    }
    println("The Sum of digits $nums is: $sum")
}

fun reverseNumbers(){
    println("Enter Some Integers: ")
    var nums = readln().toInt()
    var revNums = 0
    while(nums > 0){
        revNums = revNums * 10 + nums % 10
        nums /= 10
    }
   println("The revNums is $revNums")
}

fun checkPowerOfNumber(){
    println("Enter Base Number: ")
    val base = readln().toInt()
    println("Enter X Number: ")
    val x = readln().toInt()

    var result = 1

    if (base < 1){
        println("X is 1")
    }

    while (result < x){

        result = result * x
    }
     if (result == x){
         println("True")
     } else {
         println("False")
     }

}

fun calculatePower(base: Int,exponent: Int): Int{
    var result = 1
    for (i in 1 .. exponent){
        result = base * base
    }
    return result
}

fun distanceBetweenTwoNumbers(x1: Int, y1: Int,x2: Int,y2: Int): Double {
    val y3 = calculatePower(y2-y1,2)
    val x3 = calculatePower(x2-x1,2)
    return sqrt((x3+y3).toDouble())
}
fun calculatePie(){
    println("Pie is the division of 22/7")
    val pie: Double = 22.0/7.0
    println("So the value of pie is $pie")
}

fun validTraingle(a: Int, b: Int, c: Int){

    if (a + b > c && a + c > b && b + c > a){
        println("Valid Triangle")
    } else {
        println("Invalid Triangle")
    }

}