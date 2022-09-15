open class Animal {

    open var image: String = ""
    open var food: String = ""
    open var habitat: String = ""
    open var hunger: String = ""

    open fun makeNoise() {
        println( "The animal is making a noise" )
    }

    open fun eat() {
        println( "The animal is eating" )
    }

    open fun roam() {
        println( "The animal is roaming" )
    }

    open fun sleep() {
        println( "The animal is sleeping" )
    }
}

class Hippo: Animal() {
    override var image = "hippo.jpg"
    override var food = "grass"
    override var habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println( "The hippo is eating $food" )
    }
}

class Canine: Animal() {
    override fun roam() {

    }
}

class Wolf: Animal() {
    override var image = "wolf.jpg"
    override var food = "meat"
    override var habitat = "forests"

    override fun makeNoise() {
        println("Hoooow!")
    }

    override fun eat() {
        println( "The wolf is eating $food" )
    }
}