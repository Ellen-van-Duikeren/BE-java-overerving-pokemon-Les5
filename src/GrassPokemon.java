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
    public void templateAttackMethod(Pokemon name, Pokemon enemy, String nameAttack, int hpMinInAttack) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + ", with " + nameAttack + ".");
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
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {  // grass
        int hpMinInAttack = 2;
        String nameAttack = "solarbeam";
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    // leechSeed heeft extra functies: 'leechSeed` trekt hp van de vijand af en geeft deze hp aan de aanvallende Pokémon terug;
    public void leechSeed(Pokemon name, Pokemon enemy) {  // grass
        int hpMinInAttack = 2;
        String nameAttack = "leechseed";

        System.out.println(name.getName() + " attacks " + enemy.getName() + ", with " + nameAttack + ".");
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
        name.setHp(enemy.getHp() + (minHp));
        System.out.println(enemy.getName() + " loses " + minHp + " hp and has now " + enemy.getHp() + "hp.");
        System.out.println(name.getName() + " wins " + minHp + " hp and has now " + name.getHp() + "hp.");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {  // grass
        int hpMinInAttack = 3;
        String nameAttack = "leaveblade";
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }


//----- gettersNsetters ---------------------------------------------------------------------------------------
    public List<String> getAttacks() {
        return attacks;
    }
}
