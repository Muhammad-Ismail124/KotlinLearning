//fun largestNumberInArray(arr: IntArray) {
//    val numbers = intArrayOf(1,2,3,4,5)
//
//    var largestInArray = numbers[0]
//
//    for (num in numbers) {
//        if (num > largestInArray) {
//            largestInArray = num
//        }
//    }
//    println("The largest number is $largestInArray")
//}

//fun largestNumberInArray(numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)) {
//    var index = 0
//    var largest = numbers.first()
//
//    while (index <= numbers.lastIndex) {
//        if (numbers[index] > largest) largest = numbers[index]
//        index++
//    }
//
//    println(largest)
//}

fun largestNumbersInArray(vararg numbers: Int) {
    var index = 0
    var largest = numbers.first()

    while (index <= numbers.lastIndex) {
        if (numbers[index] > largest) largest = numbers[index]
        index++
    }

    println(largest)
}