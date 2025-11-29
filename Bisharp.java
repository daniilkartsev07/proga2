package info.pokemons;

import ru.ifmo.se.pokemon.*;
import info.moves.*;

public class Bisharp extends Pawniard {
    public Bisharp(String name, int level) {
        super(name, level);
        setStats(65, 125, 100, 60, 70, 70);
        setType(Type.DARK, Type.STEEL);
        setMove(new NightSlash(), new ScaryFace(), new MetalSound(), new StoneEdge());
    }
}
