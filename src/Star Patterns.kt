fun leftToRight () {
    print("Enter Number Of Lines: ")
    val n: Int = readln().toInt()

    for (i in 1 ..n){
        for(j in 1 .. i){
            print(" * ")
        }
        print("\n")
    }
}

fun upsideDownLeftToRight() {
    print("Enter Number Of Lines: ")
    val n: Int = readln().toInt()

    for (i in 1 ..n){
        for(j in n downTo i){
            print(" * ")
        }
        print("\n")
    }

}

fun rightToLeft(){

print("Enter Number Of Lines: ")
    val n: Int = readln().toInt()

    for (i in 1 .. n){
        for(j in n downTo i){
            print(" ")
        }
        for (k in 1 .. i){
            print("*")
        }
print("\n")
    }


    }



fun upsideDownRightToLeft() {
    print("Enter Number Of Lines: ")
    val n: Int = readln().toInt()

    for (i in n downTo 1){
        for(j in n downTo i){
            print("  ")
        }
        for (k in 1 .. i){
            print(" * ")
        }
        print("\n")
    }



}

fun triangle(){
    print("Enter Number Of Lines: ")
    val n: Int = readln().toInt()

    



}