fun guessGame() {

val numberOfTries = 10

val randomNumber = (1..20).random()

println("Number Of Tries You Have Are : $numberOfTries")

for (i in 1..numberOfTries) {
    print("Enter Your Guess: ")
    val guessNumber = readln().toIntOrNull()
    if (guessNumber == null) {
        println("Invalid Guess Number")
        continue
    }


    if (guessNumber == randomNumber) {

        println("Your Guess Is Right")
        println("Remaining Number Of Tries Left Were: ${numberOfTries - i}")
        break

    } else if (guessNumber > randomNumber) {
        println("Wrong Guess!! You Are Above!! Try Again nigga")

    } else {
        println("Wrong Guess!! You Are Below!! Try Again..Damn u suck")

    }
    if (i == numberOfTries) {
        println("You Have Used All Of Your Tries...GET OUT!!")
    }
  }
}