package Day2

import java.util.UUID

/**
 * Enum class lets you create a set of values that represent the only valid values for a variable.
 * Each enum constant exists as a single instance of that class
 */

enum class BandMember( val instrument: String ) {
    JERRY( "lead guitar" ){
         override fun sings() = "plaintively"
    },
    BOBBY( "rhythm guitar" ) {
         override fun sings() = "hoarsely"
    },
    PHIL( "base" );

    open fun sings() = "occasionally"
}

enum class EntityType {
    EASY,
    MEDIUM,
    DIFFICULT
}

object EntityFactory {
    fun create( type: EntityType ) : Entity {
        val id = UUID.randomUUID().toString()
        val name = when( type ) {
            EntityType.EASY -> "Easy"
            EntityType.MEDIUM -> "Medium"
            EntityType.DIFFICULT -> "Difficult"
        }

        return Entity( id, name )
    }
}

class Entity( val id: String, val name: String ) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}

fun main() {
    val entity = EntityFactory.create( EntityType.DIFFICULT )
    val entity1 = EntityFactory.create( EntityType.EASY )
    println( entity )
    println( entity1 )

    var selectedBandMember: BandMember
    selectedBandMember = BandMember.BOBBY

    println( selectedBandMember.instrument )
    println( selectedBandMember.sings() )
}