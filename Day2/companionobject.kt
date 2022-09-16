package Day2

import javax.swing.text.html.parser.Entity

/**
 * Companion Objects
 * Companion Objects are same as ‘object’ but declared within a Class.
 */

fun main() {
    MyClass.count = 100
    println( MyClass.count )
    println( MyClass.typeOfCustomers() )

    val myClass = MyClass.create()
    println( myClass.print() )
    println( MyClass.getId() )
}

class MyClass private constructor( val id: String ) {
    companion object : IdProvider {
        var count: Int = -1

        fun typeOfCustomers() : String {
            return "Nepalese"
        }

        fun create() : MyClass {
            return MyClass( getId() )
        }

        override fun getId(): String {
            return "256"
        }
    }

    fun print() {
        println( "Method called" )
    }
}

interface IdProvider {
    fun getId() : String
}



