package info.pokemons;

import ru.ifmo.se.pokemon.*;
import info.moves.*;

public class Pinsir extends Pokemon {
    public Pinsir(String name, int level) {
        super(name, level);
        setStats(65, 125, 100, 55, 70, 85);
        setType(Type.BUG);
        setMove(new FocusEnergy(), new XScissor(), new Bulldoze(), new CloseCombat());
    }
}
