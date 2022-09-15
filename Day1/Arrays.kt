fun main() {
//    val name: String?= "Hey";
//
//    // Elvis operator
//    var value = name ?: "null value"
//    println(value)
//
//    val person = Person("Bikram","Chand")
//    person.firstName = "Kotlin"
//    println(person.firstName)
//    person.printInfo()

    val schools = listOf("mackerel", "trout", "halibut")
    println(schools)

    val numbers = mutableListOf(1, 2, 4, 100)
    println(numbers)
    numbers.remove(1)
    println(numbers)

    val school = arrayOf("shark", "salmon", "minnow")
    println( school.get(0))
    println(java.util.Arrays.toString(school))
    school[2] = "new"
    println(java.util.Arrays.toString(school))

    val numbers2 = intArrayOf(30, 200)
    val numbers3 = intArrayOf(60, 10)
    val numbers4 = numbers2 + numbers3
    println(java.util.Arrays.toString(numbers4))

    for (number in numbers4) {
        println(number)
    }

    for ((index, element) in numbers4.withIndex()) {
        println("$index  $element")
    }

    val names = arrayOf("Bikram", "Mithun", "Chand")
    names.forEach { name ->
        println(name)
    }

    names.forEachIndexed { index, name ->
        println( "$index $name" )
    }

    val map = mutableMapOf( 1 to "Bikram", "lastname" to "chand" )
    println( map.get(1) )

    map.put( "age", "21" )
    map.forEach { key, value ->
        println( "$key $value" )
    }
}
