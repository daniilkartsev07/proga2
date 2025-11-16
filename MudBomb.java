package info.moves;

import ru.ifmo.se.pokemon.*;

public class MudBomb extends SpecialMove {
    public MudBomb() {
        super(Type.GROUND, 65, 85);
    }

    private boolean lowered = false;

    @Override
    protected void applyOppEffects(Pokemon p) {
        lowered = false;
        if (Math.random() <= 0.3) {
            lowered = true;
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe() {
        return lowered ? "кидает грязь и снижает спец-защиту" : "кидает грязь";
    }
}
