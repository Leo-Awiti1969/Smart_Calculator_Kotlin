fun iterator(map: Map<String, Int>) {
    for (item in map) {
        if (item.value % "3".toInt() == 0) {
            println("Fizz")
        } else if (item.value % "5".toInt() == 0) {
            println("Buzz")
        } else {
            println("FizzBuzz")
        }
    }
}
