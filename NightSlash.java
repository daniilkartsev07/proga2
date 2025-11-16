package info.moves;

import ru.ifmo.se.pokemon.*;

public class NightSlash extends PhysicalMove {
    public NightSlash() {
        super(Type.DARK, 70, 100);
    }

    @Override
    protected String describe() {
        return "делает ночной удар";
    }
}
