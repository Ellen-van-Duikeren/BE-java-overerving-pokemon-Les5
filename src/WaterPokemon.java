import java.util.List;

public class WaterPokemon extends Pokemon {
    private Pokemon blastoise;
    private Pokemon gyarados;

    //----- constructor ----------------------------------------------------------------------------------------------
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public WaterPokemon(String type, List<String> attacks, String name, int level, int hp, String food, String sound, Pokemon blastoise, Pokemon gyarados) {
        super(type, attacks, name, level, hp, food, sound);
        this.blastoise = blastoise;
        this.gyarados = gyarados;
    }

    public WaterPokemon(String type, List<String> attacks, String name, int level, int hp, String food, String sound, List<Pokemon> pokemons, Pokemon blastoise, Pokemon gyarados) {
        super(type, attacks, name, level, hp, food, sound, pokemons);
        this.blastoise = blastoise;
        this.gyarados = gyarados;
    }


    //----- methodes ----------------------------------------------------------------------------------------------
    // zie bij electricPokemon voor welke manier ik heb gekozen wb hp verliezen
    int factor = 1;  // initiatie factor, verandert per type tegen type
    int minHp = 0;  // initiatie minHp, is totaal aantal min punten na berekening hpMinInAttack * factor

    public void templateAttackMethod(Pokemon name, Pokemon enemy, String nameAttack, int hpMinInAttack) {
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
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

    public Pokemon getBlastoise() {
        return blastoise;
    }

    public void setBlastoise(Pokemon blastoise) {
        this.blastoise = blastoise;
    }

    public Pokemon getGyarados() {
        return gyarados;
    }

    public void setGyarados(Pokemon gyarados) {
        this.gyarados = gyarados;
    }

}
