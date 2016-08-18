package ink.abb.pogo.api.cache

class MapCell(val cellId: Long) {
    var pokemon = setOf<MapPokemon>()
    val pokestops = mutableSetOf<Pokestop>()
    val gyms = mutableSetOf<Gym>()

    fun equals(that: MapCell): Boolean {
        return that.cellId == cellId
    }
}