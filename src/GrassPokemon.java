import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final String type = "grass";
    private final List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");


//----- constructor ----------------------------------------------------------------------------------------------
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
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
                factor = 4;
                break;
            case "fire":
                factor = 3;
                break;
            case "grass":
                factor = 1;
                break;
            case "water":
                factor = 2;
                break;
            default:
                factor = 1;
        }
        minHp = hpMinInAttack * factor;
        enemy.setHp(enemy.getHp() - (minHp));
        System.out.println(enemy.getName() + " loses " + minHp + " hp and has now " + enemy.getHp() + "hp.");
    }

    public void leafStorm(Pokemon name, Pokemon enemy) { // grass
        int hpMinInAttack = 1;
        String nameAttack = "leafstorm";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {  // grass
        int hpMinInAttack = 2;
        String nameAttack = "solarbeam";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {  // grass
        int hpMinInAttack = 2;
        String nameAttack = "leechseed";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {  // grass
        int hpMinInAttack = 3;
        String nameAttack = "leaveblade";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

//----- gettersNsetters ---------------------------------------------------------------------------------------


    // 1 getter nl voor attacks
    public List<String> getAttacks() {
        return attacks;
    }
}
