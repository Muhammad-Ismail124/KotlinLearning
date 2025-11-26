fun primeNumberInRange() {

    println("Enter The Start Of The Range: ")
    val rangeStart = readln().toInt()
    println("Enter The End Of The Range: ")
    val rangeEnd = readln().toInt()

   for (numbers in rangeStart..rangeEnd) {
       var ifPrime = true

    for (i in 2 until numbers){
        if (numbers % i == 0){
            ifPrime = false
            break
        }
    }

      if (ifPrime == true){
          println("$numbers")
      }

   }

}