package Day2

/**
 * Sealed Classes
 * Sealed class is like a souped-up version of an enum class.
 * It lets you restrict your class hierarchy to a specific set of subtypes, each one of which can define its own properties and functions.
 * Unlike an enum class, you can create multiple instances of each type.
 */

sealed class MessageType {
    class MessageSuccess( var msg: String ) : MessageType()
    class MessageFailure( var msg: String, var e: Exception ) : MessageType()
}
sealed class Data {
    data class Success( val data: String ) : Data()
    data class Error( val error: String ) : Data()
    object Loading : Data()
}

fun getData() : Data {
    return Data.Success(( 100..1000 ).random().toString())
}

fun main() {
    val messageSuccess = MessageType.MessageSuccess( "Yay" )
    val messageFailure = MessageType.MessageFailure( "Boo!", Exception( "Gone wrong" ) )
    var myMessageType: MessageType = messageFailure
    val myMessage = when (myMessageType) {
        is MessageType.MessageSuccess -> myMessageType.msg
        is MessageType.MessageFailure -> myMessageType.msg + " " + myMessageType.e.message
    }

    println( myMessage )


    val data = getData()
    when( data ) {
        is Data.Success -> {
            println( data )
        }
        is Data.Error -> {
            println( data )
        }
        is Data.Loading -> {
            println( data )
        }
    }
}