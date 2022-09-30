import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "fire";
    private final List<String> attacks = Arrays.asList("firelash", "flamethrower", "pyroball", "inferno");


//----- constructor ----------------------------------------------------------------------------------------------

    public FirePokemon(String name, int level, int hp, String food, String sound) {
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
                factor = 2;
                break;
            case "fire":
                factor = 1;
                break;
            case "grass":
                factor = 4;
                break;
            case "water":
                factor = 3;
                break;
            default:
                factor = 1;
        }
        minHp = hpMinInAttack * factor;
        enemy.setHp(enemy.getHp() - (minHp));
        System.out.println(enemy.getName() + " loses " + minHp + " hp and has now " + enemy.getHp() + "hp.");
    }


    void fireLash(Pokemon name, Pokemon enemy) { //fire
        int hpMinInAttack = 1;
        String nameAttack = "firelash";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void flameThrower(Pokemon name, Pokemon enemy) {  // fire
        int hpMinInAttack = 2;
        String nameAttack = "flamethrower";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void pyroBall(Pokemon name, Pokemon enemy) {  // fire
        int hpMinInAttack = 2;
        String nameAttack = "pyroball";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void inferno(Pokemon name, Pokemon enemy) {  // fire
        int hpMinInAttack = 3;
        String nameAttack = "inferno";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }


//----- gettersNsetters ---------------------------------------------------------------------------------------
// 1 getter nl voor attacks


    public List<String> getAttacks() {
        return attacks;
    }
}
