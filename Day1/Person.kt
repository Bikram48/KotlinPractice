class Person(_firstName:String, _lastName:String) {
    var lastName: String? = _lastName
    var firstName: String? = _firstName
        set(value) {
            field = value
//            println("New value is $value")
        }
        get() {
//            println("Returned value $field")
            return field;
        }

    fun printInfo() {
        println("$firstName -> $lastName")
    }
}