// You can experiment here, it won’t be checked

class Superhero {
    val power = 1000

    class MagicCloak {
        // you cannot access something from Superhero here
        val magicPower = 100
    }
    // you need to create a MagicCloak object to access its members
    val magicPower = power*MagicCloak().magicPower

    class Hammer {
        // you cannot access power property from Superhero here
        val mightPower = 100
    }
    val mightPower = power*Hammer().mightPower
}

class Cat(val name: String) {
    fun sayMeow() {
        println("$name says: \"Meow\".")
    }

    inner class Bow(val color: String) {
        fun putOnABow() {
            sayMeow()
            println("The bow is on!")
        }

        fun printColor() {
            println("The cat named $name has a $color bow.")
        }
    }
    val catBow = Bow("Green")

    class Cat1(val name: String, val color: String) {
        inner class Bow1(val color: String) {
            fun printColor() {
                println("The cat named $name is ${this@Cat.color} and has a $color bow.")
            }
        }
    }
}

fun main(args: Array<String>) {
    val cloak = Superhero.MagicCloak()
    val hammer = Superhero.Hammer()

//    val cat: Cat = Cat("Bob")
//    val bow: Cat.Bow = cat.Bow("red")

//    bow.printColor()
//    println("")

    val cat: Cat = Cat("Princess")
    val bow: Cat.Bow = cat.Bow("golden")

    bow.printColor()
    bow.putOnABow()
    println("")

    println(cloak)
    println(hammer)

//    val outer = Outer()
//    val inner = outer.Inner()
}