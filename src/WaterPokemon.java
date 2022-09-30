import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final String type = "water";
    private final List<String> attacks = Arrays.asList("surf", "hydropump", "Hydrocanon", "raindance");


    //----- constructor ----------------------------------------------------------------------------------------------


    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }

    //----- methodes ----------------------------------------------------------------------------------------------
    // zie bij electricPokemon voor welke manier ik heb gekozen wb hp verliezen
    int factor = 1;  // initiatie factor, verandert per type tegen type
    int minHp = 0;  // initiatie minHp, is totaal aantal min punten na berekening hpMinInAttack * factor

    public void templateAttackMethod(Pokemon name, Pokemon enemy, String nameAttack, int hpMinInAttack) {
        System.out.println(name.getName() + " valt " + enemy.getName() + " aan met " + nameAttack + ".");
        switch (enemy.getType()) {
            case "electric":
                factor = 3;
                break;
            case "fire":
                factor = 4;
                break;
            case "grass":
                factor = 2;
                break;
            case "water":
                factor = 1;
                break;
            default:
                factor = 1;
        }
        minHp = hpMinInAttack * factor;
        enemy.setHp(enemy.getHp() - (minHp));
        System.out.println(enemy.getName() + " loses " + minHp + " hp and has now " + enemy.getHp() + "hp.");
    }

    void surf(Pokemon name, Pokemon enemy) { // water
        int hpMinInAttack = 1;
        String nameAttack = "surf";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void hydroPump(Pokemon name, Pokemon enemy) {  // water
        int hpMinInAttack = 2;
        String nameAttack = "hydropump";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void hydroCanon(Pokemon name, Pokemon enemy) { // water
        int hpMinInAttack = 2;
        String nameAttack = "hydrocanon";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void rainDance(Pokemon name, Pokemon enemy) {  // water
        int hpMinInAttack = 3;
        String nameAttack = "raindance";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    //----- gettersNsetters ---------------------------------------------------------------------------------------

    // 1 getter nl voor attacks


    public List<String> getAttacks() {
        return attacks;
    }
}
