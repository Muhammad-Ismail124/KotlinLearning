fun leapYear() {

    println("Enter the year you're looking for: ")
    val year = readln().toInt()
    println("You Entered The year $year")
    if (year % 4 == 0 || year % 400 == 0 ) {
        println("This is a leap year")
    } else if (year % 100 == 0){
        println("This not is a leap year")
    } else {
        println("This is not a leap year")
    }
}

fun isLeapYear(year: Int): Boolean {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0
}

fun testLeapYear() {
    println("Enter the year you're looking for:")
    val year = readln().toIntOrNull()

    year?.let {
        isLeapYear(year).conditional(
            { println("This is not a leap year") }
        ) { println("This is a leap year") }
    }
}

fun Boolean.conditional(
    ifFalse: () -> Unit,
    block: () -> Unit
) {
    return if (this) block() else ifFalse()
}