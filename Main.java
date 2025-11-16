import ru.ifmo.se.pokemon.*;
import info.pokemons.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pinsir p1 = new Pinsir("Пинсир", 2);
        Pawniard p2 = new Pawniard("Поньярд", 2);
        Bisharp p3 = new Bisharp("Бишарп", 2);

        Happiny p4 = new Happiny("Хэппини", 2);
        Chansey p6 = new Chansey("Чэнси", 2);
        Blissey p5 = new Blissey("Блисси", 2);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
