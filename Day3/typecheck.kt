package Day3

/**
 * Type check is a way of checking the type(DataType) or Class of a particular instance or variable while runtime to separate the flow for different objects.
 */

interface Shape {
    fun calculateArea(): Float
}

class Circle: Shape {
    var radius: Float = 10.0f
    override fun calculateArea(): Float {
        return (22 * radius * radius)
    }
}

class Square : Shape {
    var sideLength: Float = 10.0f
    override fun calculateArea(): Float {
        return sideLength * sideLength
    }
}

class Rectangle : Shape {
    var length: Float = 10.0f
    var breadth: Float = 5.0f
    override fun calculateArea(): Float {
        return length * breadth
    }
}

fun main() {
    var shapeObject: Shape = Circle()

    println( shapeObject.calculateArea() )
    if( shapeObject is Circle ) {
        println( "It's a circle" )
    } else if( shapeObject is Square ) {
        println( "It's is a square" )
    } else if( shapeObject is Rectangle ) {
        println( "It is a rectangle" )
    }

    var number: Int = 10
    if( number is Int ) {
        println( "Yes it is integer" )
    }
}