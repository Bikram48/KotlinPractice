// Primary Constructor
class Vehicle( name: String, model: String ) {
    val name: String
    val model: String
    var price: Double? = null
       set(value) {
           field = value
           println( "New price is: $value" )
       }
       get() {
           println( "Returned price is: $field" )
           return field
       }

    init {
        this.name = name
        this.model = model
        println( "Init1 called" )
    }

    // Secondary constructor
    constructor():this( "Toyota", "Camry" ) {
        println( "Secondary constructor called" )
    }

    init {
        println( "Init2 called" )
    }
}

fun main() {
    var vehicle = Vehicle( "Toyota", "Camry" )
    println( vehicle.name )
    println( vehicle.model )
    vehicle.price = 1000000.56
    println( vehicle.price )
}
