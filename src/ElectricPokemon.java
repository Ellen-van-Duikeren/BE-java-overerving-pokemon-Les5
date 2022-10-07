import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final String type = "electric";
    private final List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");


//----- constructor ----------------------------------------------------------------------------------------------

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(type, name, level, hp, food, sound);
    }


//----- methodes ----------------------------------------------------------------------------------------------
// aangezien in pokemon wiki niet wordt aangegeven hoeveel hp een pokemon verliest maar dit daar veel ingewikkelder ligt, heb ik mijn eigen systeem bedacht. Dus nu geef ik in de methode het aantal minhp mee (1, 2 of 3 heb ik bedacht) en afh van welk type tegen welk type geef ik een factor mee. Dus bijvoorbeeld: minHp  Het type fire🔥 doet de meeste schade aan grass-pokémons🌿 > factor 4, dus min 8 hp, daarna aan water-pokémons🌊 > factor 3 = min 6 hp, dan de electric-pokémons⚡ > factor 2 = min 4 hp en het minste bij fire-pokémons🔥 > factor 1 = min 2 hp.

// onderstaande methode is een methode die ik in elk van de electricPokemons toepas. Deze is weer anders voor de WaterPokemon enz omdat de factor anders is.
    public void templateAttackMethod(Pokemon name, Pokemon enemy, String nameAttack, int hpMinInAttack) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + ", with " + nameAttack + ".");
        switch (enemy.getType()) {
            case "electric":
                factor = 1;
                break;
            case "fire":
                factor = 2;
                break;
            case "grass":
                factor = 3;
                break;
            case "water":
                factor = 4;
                break;
            default:
                factor = 1;
        }
        minHp = hpMinInAttack * factor;
        enemy.setHp(enemy.getHp() - (minHp));
        System.out.println(enemy.getName() + " loses " + minHp + " hp and has now " + enemy.getHp() + "hp.");
    }

    void thunderPunch(Pokemon name, Pokemon enemy) { // electric
        int hpMinInAttack = 1;
        String nameAttack = "thunderpunch";
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void electroBall(Pokemon name, Pokemon enemy) { // electric
        int hpMinInAttack = 2;
        String nameAttack = "electroBall";
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    // thunder heeft extra functies
    void thunder(Pokemon name, Pokemon enemy) { // electric
        int hpMinInAttack = 2;
        String nameAttack = "thunder";
        System.out.println(name.getName() + " attacks " + enemy.getName() + ", with " + nameAttack + ".");
        switch (enemy.getType()) {
            case "electric":
                //extra functie: 'thunder` levert een hp boost aan electric pokemons;
                factor = 0;
                enemy.setHp(enemy.getHp() + 20);
                System.out.println(nameAttack + " gives a hp boost of 20 to electric pokemons.");
                break;
            case "fire":
                factor = 2;
                break;
            case "grass":
                factor = 3;
                break;
            case "water":
                factor = 4;
                break;
            default:
                factor = 1;
        }
        minHp = hpMinInAttack * factor;
        enemy.setHp(enemy.getHp() - (minHp));
        System.out.println(enemy.getName() + " loses " + minHp + " hp and has now " + enemy.getHp() + "hp.");
    }

    void voltTackle(Pokemon name, Pokemon enemy) {  // electric
        int hpMinInAttack = 3;
        String nameAttack = "voltTackle";
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }


//----- gettersNsetters ---------------------------------------------------------------------------------------
    public List<String> getAttacks() {
        return attacks;
    }
}
