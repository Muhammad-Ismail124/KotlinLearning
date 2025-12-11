fun arrayActions(){
val numbers = readNumbers()
val myArray = numbers.toIntArray()

    println("The Array Contents Are: ${myArray.joinToString(", ")}")
    performAction(askForAction(), myArray)
}


fun readNumbers(): MutableList<Int> {
    val numbers = mutableListOf<Int>()
    println("Enter Numbers One by One And Type 'done' to finish: ")

    while (true){
        val input = readln()

        if (input == "done" || input == "Done") break
        val number = input.toIntOrNull()

        if (number != null) {
            numbers.add(number)
        } else {
            println("Please Enter A Valid Number Or 'Done' to finish:")
        }
    }
    return numbers
}

fun askForAction():String{
    println("Please Enter An Action To Perform Print,Reverse,Sum Or Max")
    return readln().lowercase()
}

fun performAction(action: String,array:IntArray) {
    when (action){

        "max" -> {
            val max = array.maxOrNull()
            println("Maximum number is $max")
        }

        "print" -> {println("The Numbers are ${array.joinToString(", ")}")}

        "sum" -> {
            val sum = array.sum()
            println("Sum number is $sum")
        }

        "reverse" -> {
            println("Reverse numbers are ${array.reversed().joinToString(", ")}")
        }

        else -> println("Unknown action")

    }
}