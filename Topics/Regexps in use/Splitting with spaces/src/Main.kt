fun main() {
//    val string = readLine()!!
//    val n = readLine()!!.toInt()
    val newString = "Lorem    ipsum dolor sit, amet,    consectetur".split(" ", limit = 3)
    for (i in newString) {
        if (i != "") {
            if (i != " ") {
                println(i.trim())
            }
        }
    }
    println(newString)
}