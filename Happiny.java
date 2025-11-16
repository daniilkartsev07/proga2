package info.pokemons;

import ru.ifmo.se.pokemon.*;
import info.moves.*;

public class Happiny extends Pokemon {
    public Happiny(String name, int level) {
        super(name, level);
        setStats(100, 5, 5, 15, 65, 30);
        setType(Type.NORMAL);
        setMove(new WorkUp(), new Psychic());
    }
}
