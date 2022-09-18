package Day3

fun practiceArray() {
    var arr: Array<Any?> = arrayOf( 1, 3, 2 )

    // Flips the order of the items in the array
    arr.reverse()
    for( (index, element) in arr.withIndex() ) {
        println( "$index $element" )
    }

    val isIn = arr.contains( 1 )
    println( isIn )

    // changes the order of the items in array so they go from the lowest value to the highest, of from false to true
    arr.sort()
    println( java.util.Arrays.toString( arr ) )

    arr[2] = null
    println( java.util.Arrays.toString( arr ) )
}

fun practiceLists() {
    val list: List<String>
    list = listOf( "Bikram", "Chand", "Mithun" )
//    for( element in list ) {
//        println( element )
//    }
    println( list.get(0) )
    println( list.size )
    println( list.contains( "Bikram" ) )

    val shopping = mutableListOf<String>("Tea", "Eggs")
    println( shopping )
    shopping.add( "Milk" )
    println( shopping )
    shopping.removeLast()
    shopping.removeAt( 0 )
    println( shopping )

    shopping.set( 0, "Coffee" )
    shopping.reverse()
    println( shopping )

    val toAdd = listOf( "Cookies", "Sugar" )
    shopping.addAll( toAdd )
    println( shopping )

    shopping.retainAll( toAdd )
    println( shopping )

    val shoppingCopy = toAdd.toList()
    println( shoppingCopy )
}

fun practiceSet() {
    val friendSet = setOf( "Jim", "Sue", "Nick", "Nick" )
    println( friendSet )
    println( friendSet.contains( "Nick" ) )

    for( friend in friendSet ) {
        println( friend )
    }

    val mFriendSet = mutableSetOf( "Jim", "Sue" )
    mFriendSet.add( "Sam" )
    mFriendSet.add( "Fam" )

    println( mFriendSet )
    mFriendSet.remove( "Sam" )
    println( mFriendSet )
    println(  )
}

fun practiceMap() {
    val recipeToCheck = mapOf( 1 to "meat", 2 to "chicken" )
    if( recipeToCheck.containsKey( 1 ) ) {
        println( "Key exists" )
    }
    if( recipeToCheck.containsValue( "chicken" ) ) {
        println( "Value exists" )
    }

    val names = mutableMapOf<Int, String>( 1 to "Bikram", 2 to "Mithun" )
    names.put( 3, "Justin" )
    names.put( 4, "Timothee" )

    println( names )
    println( names.get( 3 ) )

    val extraNames = mutableMapOf<Int, String>( 5 to "Sharukh", 6 to "Salman" )
    names.putAll( extraNames )
    println( names )

    println( names.count() )

    println( names.filter{
        it.key == 1 || it.value == "Mithun"
    })

    names.toSortedMap()

    names.forEach { key, value ->
        println( "$key -> $value")
    }
}

fun main() {
//    practiceArray()
//    practiceLists()
//    practiceSet()
    practiceMap()
}