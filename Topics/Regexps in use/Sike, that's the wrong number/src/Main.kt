fun main() {
    val number = readln()
    println(number.replace("[a-z,A-Z]".toRegex(), ""))
}