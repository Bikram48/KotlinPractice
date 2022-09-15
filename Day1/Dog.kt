class Dog( val name: String, _breed: String, _weight: Double ) {
    val breed = _breed
    var weight = _weight
        set(value) {
            if(value>0) field = value
            else print("Error")
        }

}

fun main() {
    var dog = Dog( "Shephard", "bred", 20.4);
    dog.weight = -1.1
}