/**
 * Marker Interface - An interface with no fields and methods
 */

//interface PersonInfoProvider

/**
 *
 */
interface PersonInfoProvider {
    fun printInfo( person: Person )

    /**
     * Unlike Java, Kotlin interfaces allows you to provide default implementation of an interface method.
     * We can also provide properties on our methods, however, you can't initialize theme.
     */
//    val firstName: String

    fun printLastName(person: Person ) {
        println( person.lastName )
    }
}

interface SessionInfoProvider {
    fun getSessionID(): String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    open val providerInfo: String = "InfoProvider"

    override fun printInfo(person: Person ) {
        println( person.firstName )
  }

    override fun getSessionID(): String {
        return "Session id"
    }

    open fun printClassInfo() {
        println( "This is super class" )
    }
}

fun main() {
    val person = Person( "Bikram", "Chand" )
    val provider = BasicInfoProvider()
    provider.printInfo( person )
    provider.getSessionID()
}
