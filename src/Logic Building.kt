import kotlin.math.pow
import kotlin.math.sqrt

//---------------------------------------------------------------------------------------------------
fun evenOrOdd(n: Int) {
    if (n.isEven()) {
        println("Even")
    } else {
        println("Odd")
    }
}

//-------------------------------------------------------------------------------------------------------
fun Int.isEven(): Boolean = this % 2 == 0

//------------------------------------------------------------------------------------------------------------
fun multiTable() {
    println("Enter The Number: ")
    val n = readln().toInt()

    for (i in 1..10) {
        println("$n  *  $i  = ${i * n}")
    }
}

//-------------------------------------------------------------------------------------------------------------------------
fun sumOfNaturals() {

    println("Enter A number: ")
    val num = readln().toInt()
    var sum = 0
    for (i in 1..num) {
        sum += i
    }
    println("$sum")
}

//------------------------------------------------------------------------------------------------------
fun squareOfNaturals() {
    println("Enter A number: ")
    val num = readln().toInt()

    var sum = 0
    for (i in 1..num) {
        sum += (i * i)
    }
    print("$sum")
}

//--------------------------------------------------------------------------------------------------------
fun swapTwoNum() {

    println("Enter A number: ")
    var num1 = readln().toInt()
    println("Enter Another Number:")
    var num2 = readln().toInt()
    println("First Place:$num1   Second Place: $num2  ")
    val temp = num1
    num1 = num2
    num2 = temp
    println("First Place: $num1   Second Place:  $num2  Boom Numbers Swapped Magic ")
}

//----------------------------------------------------------------------------------------------------------
fun swapNumbers() {

    println("Enter A number: ")
    var num1 = readln().toInt()
    println("Enter Another Number:")
    var num2 = readln().toInt()
    println("First Place:$num1   Second Place: $num2  ")

    num1 = num1 xor num2
    num2 = num1 xor num2
    num1 = num1 xor num2

    println("First Place: $num1   Second Place:  $num2  Boom Numbers Swapped Magic ")
}

//--------------------------------------------------------------------------------------------------------
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

//------------------------------------------------------------------------------------------------------------
fun nthTermFromFirstTwoTerms(a1: Int, a2: Int, n: Int): Int {
    return (a1 + (n - 1) * (a2 - a1))

}

//----------------------------------------------------------------------------------------------------------------------
fun sumOfIntegers() {
    println("Enter some numbers: ")
    val nums = readln().toInt()
    val digits = nums.toString()
    var sum = 0
    for (i in digits) {
        val digit = i.toString().toInt()
        sum = sum + digit
    }
    println("The Sum of digits $nums is: $sum")
}

//----------------------------------------------------------------------------------------------------------------------
fun reverseNumbers() {
    println("Enter Some Integers: ")
    var nums = readln().toInt()
    var revNums = 0
    while (nums > 0) {
        revNums = revNums * 10 + nums % 10
        nums /= 10
    }
    println("The revNums is $revNums")
}

//----------------------------------------------------------------------------------------------------------------------
fun checkPowerOfNumber() {
    println("Enter Base Number: ")
    val base = readln().toInt()
    println("Enter X Number: ")
    val x = readln().toInt()

    var result = 1

    if (base < 1) {
        println("X is 1")
    }

    while (result < x) {

        result = result * x
    }
    if (result == x) {
        println("True")
    } else {
        println("False")
    }

}

//----------------------------------------------------------------------------------------------------------------------
fun calculatePower(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result = base * base
    }
    return result
}

//----------------------------------------------------------------------------------------------------------------------
fun distanceBetweenTwoNumbers(x1: Int, y1: Int, x2: Int, y2: Int): Double {
    val y3 = calculatePower(y2 - y1, 2)
    val x3 = calculatePower(x2 - x1, 2)
    return sqrt((x3 + y3).toDouble())
}

//----------------------------------------------------------------------------------------------------------------------
fun calculatePie() {
    println("Pie is the division of 22/7")
    val pie = 22F / 7F
    println("So the value of pie is $pie")
}

//----------------------------------------------------------------------------------------------------------------------
fun validTriangle(a: Int, b: Int, c: Int) {

    if (a + b > c && a + c > b && b + c > a) {
        println("Valid Triangle")
    } else {
        println("Invalid Triangle")
    }

}

//----------------------------------------------------------------------------------------------------------------------
fun calcVolumeOfSphere() {
    println("Enter Radius of Sphere: ")
    val radius = readln().toFloat()
    val pie = 22F / 7F
    val volume = 0.75 * pie * radius.pow(3)

    println("The Volume Of Sphere With A Radius Of $radius is $volume")
}

//----------------------------------------------------------------------------------------------------------------------
fun nameUpperCaseReverse() {
    println("Enter Your Name: ")
    val input = readln()
    val string = input[0].uppercase() + input.substring(1, input.length)
    println(reverseString(string))
}

//----------------------------------------------------------------------------------------------------------------------
fun reverseString(name: String): String {

    var reverse = ""

    for (i in name.length - 1 downTo 0) {

        reverse += name[i]
    }
    return reverse
}

//----------------------------------------------------------------------------------------------------------------------
fun ifPalindrome() {
    println("Enter A Word To Check Palindrome")
    val palindrome = readln()

    val answer = if (palindrome == palindrome.reversed()) "Palindrome" else "Not Palindrome"

    val uppercase = palindrome[0].uppercase() + palindrome.substring(1)

    println("The Word you entered is $uppercase which is $answer")
}

//----------------------------------------------------------------------------------------------------------------------
fun ageReadline() {

    println("Enter Your Age: ")
    val age: Int? = readlnOrNull()?.toInt()

    if (age != null) {
        when {
            age < 18 -> println("You Are Not An Adult")
            age in 18..60 -> println("You Are An Adult")
            else -> println("You Are really old")
        }
    }
}

//----------------------------------------------------------------------------------------------------------------------
fun ageReadline2() {
    println("Enter Your Age: ")
    val age: Int? = readlnOrNull()?.toInt()

    if (age != null) {
        if (age < 18) {
            println("You are not an adult")
        } else if (age in 18..60) {
            println("You Are An Adult")
        } else {
            println("You Are really old")

        }
    }
}

//----------------------------------------------------------------------------------------------------------------------
fun tillZero() {
    println("Enter A Number: ")
    var num = readln().toInt()

    while (num != 0) {
        println(num)
        num--
    }
}
//----------------------------------------------------------------------------------------------------------------------

fun toThePowerOf() {
    println("Enter number 1 : ")
    val base = readln().toInt()
    println("Enter number 2 : ")
    val exp = readln().toInt()
    var answer = 1
    for (i in 1..exp) {
        answer *= base
    }
    println("$base to the power of $exp is $answer")
}

//----------------------------------------------------------------------------------------------------------------------

fun arrayActions2() {

    println("Enter Numbers one by one And Type 'done' to finish ")
    var myArray = intArrayOf()
    var sum = 0

    while (true) {
        val input = readln()    // reads the input and saves it
        val number = input.toIntOrNull()

        if (number != null) {

            myArray += number

        } else {
            println("Please A valid number or 'done' to finish")
        }

        if (input == "Done" || input == "done") {

            break
        }
    }

    println("The Array Contents Are : ${myArray.joinToString(", ")}")
    println("Enter An Action: Reverse Or Print Or Sum Or Max to perform action on Array: ")
    val answer = readlnOrNull().toString()


    if (answer == "max"|| answer == "Max"){
    var max = myArray[0]
       for (sorting in myArray){
           if(sorting > max){
               max = sorting
           }
       }
        println("Max Content in Array is: $max")
    }



    if (answer == "Reverse" || answer == "reverse") {
        print("Reverse: ${myArray.reversed().joinToString(", ")}")
    }



    if (answer == "print" || answer == "Print") {
        print("From The Start The Array Has: ${myArray.joinToString(", ")}")

    }



    if (answer == "sum" || answer == "Sum") {
        for (i in myArray) {
            sum += i
        }

        println("The Sum Of Contents Of Numbers ${myArray.joinToString(",")} Is: $sum")
    }

}
//----------------------------------------------------------------------------------------------------------------------

fun averageArray(){
    println("Enter 5 Numbers: ")

    var numbers = intArrayOf()
    var count = 1

    while (numbers.size < 5){
        println("Number $count: ")
        val input = readln().trim()
        val number = input.toIntOrNull()

        if (number == null){
            println("Please enter a valid number: ")
            continue
        }

        numbers += number
        count++

    }

    val sum = numbers.sum()
    val average = numbers.average()

    println("You Entered ${numbers.joinToString(", ")}")
    println("Sum: $sum")
    println("Average: $average")
}


