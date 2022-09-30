// You can experiment here, it won’t be checked

fun main() {
  println("0\\.[0-9]{2}9{0,2}5*".toRegex().matches("0.125"))
  println("0\\.[0-9]{2}9{0,2}5*".toRegex().matches("0.1299"))
  println("0\\.[0-9]{2}9{0,2}5*".toRegex().matches("0.129955"))
  println("0\\.[0-9]{2}9{0,2}5*".toRegex().matches("0.1295"))
  println("0\\.[0-9]{2}9{0,2}5*".toRegex().matches("0.129995"))
}
