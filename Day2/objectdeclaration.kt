package Day2
/**
 * What is singleton?

- One instance of a class in the whole application.
- Meaning: if class Student is declared Singleton then we cannot create objects for this class.
- There exists only one object for this class by default.
- In Java, we use static keyword for to create singleton but in Kotlin we cannot declare “static” variables and methods.

So we have alternate to that

- Declare “object”. These objects are actually acting as a class that can contain static variables and methods without using static keyword.
- Internally, this creates a singleton object when program runs
 */

fun main() {
    // Accessing properties and methods using objects
    var customerData = CustomerData()
    customerData.count = 100
    customerData.typeOfCustomers()
    println( customerData.count )

    // Accessing properties and methods using Object declaration
    Customer.name = "Alex"
    println( Customer.printName() )
    Customer.display()
}

class CustomerData {
    var count: Int = -1

    fun typeOfCustomers() : String {
        return "Nepalese"
    }
}

open class SuperClass {
    open fun display() {
        println( "Super Class" )
    }
}

object Customer : SuperClass() {
    // All properties and methods inside the object declaration acts like static variables and methods.
    var name: String = "Bikram"

    fun printName() : String {
        return name
    }

    override fun display() {
        println( "Derived Class" )
    }
}

