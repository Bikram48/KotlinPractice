fun getGameChoice(option: Array<String>) = option[(Math.random() * option.size).toInt()];

fun getUserChoice( optionParam: Array<String> ): String? {

    var userChoice = ""

    while( true ) {
        print( "Please enter one of the following")
        for( item in optionParam ) print( " $item " )

        // Read the user input
        val userInput = readLine()

        if( userInput != null && userInput in optionParam ) {
            userChoice = userInput
            break
        } else println( "You must enter a valid choice" )
    }

    return userChoice
}


fun main() {
    val options = arrayOf( "Rock", "Paper", "Scissors" )
    val gameChoice = getGameChoice( options )
    val userChoice = getUserChoice( options )
    printResult( userChoice, gameChoice )
}

fun printResult( userChoice: String?, gameChoice: String ) {

    if( userChoice === gameChoice ) println( "Result is tie" )
    else if( (userChoice === "Rock" && gameChoice === "Scissors") ||
        (userChoice === "Paper" && gameChoice === "Rock") ||
        (userChoice === "Scissors" && gameChoice === "Paper") ) println( "You won" )
    else println( "You loose!" )
}