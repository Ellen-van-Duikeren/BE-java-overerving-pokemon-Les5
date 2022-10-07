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
    public void templateAttackMethod(Pokemon name, Pokemon enemy, String nameAttack, int hpMinInAttack) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + ", with " + nameAttack + ".");
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
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void flameThrower(Pokemon name, Pokemon enemy) {  // fire
        int hpMinInAttack = 2;
        String nameAttack = "flamethrower";
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void pyroBall(Pokemon name, Pokemon enemy) {  // fire
        int hpMinInAttack = 2;
        String nameAttack = "pyroball";
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void inferno(Pokemon name, Pokemon enemy) {  // fire
        int hpMinInAttack = 3;
        String nameAttack = "inferno";
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }


//----- gettersNsetters ---------------------------------------------------------------------------------------
    public List<String> getAttacks() {
        return attacks;
    }
}
