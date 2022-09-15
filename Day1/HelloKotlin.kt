fun main() {

    val a1: Int = 10_000_00
    val a2: Byte = a1.toByte()
    println( a1 )
    println( a2 )

    var fish = 1.5
    fish = 10.1
    println( fish )

    val sentence = "I have total $fish" + " fish"
    println( sentence )

    val people = 50
    if( people in 1..100 ) {
        println( people )
    }

   var number = 100
    when( number ) {
        10 -> println("Correct")
        in 20..30 -> println("Larger number")
        else -> println("Incorrect")
    }

    var num: Int? = null
    num = num?.dec()?:0
    print( num )
}



