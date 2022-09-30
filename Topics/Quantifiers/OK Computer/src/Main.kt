fun main() {
    val text = readln()
//    println(".*Computer.*".toRegex().matches(text))
    println("[A-Z]\\d\\w".toRegex().matches(text))
//    println("ab*a".toRegex().matches(text))
//    println("ab{0,3}a".toRegex().matches(text))
//    println("ab{3,}a".toRegex().matches(text))
}