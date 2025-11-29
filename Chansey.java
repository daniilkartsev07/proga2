package info.pokemons;

import ru.ifmo.se.pokemon.*;
import info.moves.*;

public class Chansey extends Happiny {
    public Chansey(String name, int level) {
        super(name, level);
        setStats(250, 5, 5, 35, 105, 50);
        setType(Type.NORMAL);
        setMove(new WorkUp(), new Psychic(), new MudBomb());
    }
}
