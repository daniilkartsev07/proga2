package info.pokemons;

import ru.ifmo.se.pokemon.*;
import info.moves.*;

public class Blissey extends Chansey {
    public Blissey(String name, int level) {
        super(name, level);
        setStats(255, 10, 10, 75, 135, 55);
        setType(Type.NORMAL);
        setMove(new WorkUp(), new Psychic(), new MudBomb(), new ThunderWave());
    }
}
