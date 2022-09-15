// Top level functions

fun getGreetings(): String? {
    return null
}

// Single expression function
fun printHello() = "Hello World"

fun sayHello( greeting:String, name:String, vararg arg:String ) {
    // String templates
    println( "$greeting $name ${arg.get(1)}")

}

fun main() {
    println( getGreetings() )
    println( printHello() )

    val programming = arrayOf( "Kotlin", "Java", "JavaScript" )

    // Spread operator
    sayHello( name = "Hello", greeting = "Bikram", arg = *programming )
}