package info.pokemons;

import ru.ifmo.se.pokemon.*;
import info.moves.*;

public class Pawniard extends Pokemon {
    public Pawniard(String name, int level) {
        super(name, level);
        setStats(45, 85, 70, 40, 40, 60);
        setType(Type.DARK, Type.STEEL);
        setMove(new NightSlash(), new ScaryFace(), new MetalSound());
    }
}
