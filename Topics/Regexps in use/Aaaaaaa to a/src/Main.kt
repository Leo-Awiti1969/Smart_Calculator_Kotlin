fun main() {
    val text = readln()
    val newText = text.replace("[Aa]+".toRegex(), "a")
    println(newText)
}