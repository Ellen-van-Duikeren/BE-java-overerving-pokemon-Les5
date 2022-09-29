import java.util.List;



public class GrassPokemon extends Pokemon {
    private Pokemon venusaur;
    private Pokemon ditto;

//----- constructor ----------------------------------------------------------------------------------------------


    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public GrassPokemon(String type, List<String> attacks, String name, int level, int hp, String food, String sound, Pokemon venusaur, Pokemon ditto) {
        super(type, attacks, name, level, hp, food, sound);
        this.venusaur = venusaur;
        this.ditto = ditto;
    }

    public GrassPokemon(String type, List<String> attacks, String name, int level, int hp, String food, String sound, List<Pokemon> pokemons, Pokemon venusaur, Pokemon ditto) {
        super(type, attacks, name, level, hp, food, sound, pokemons);
        this.venusaur = venusaur;
        this.ditto = ditto;
    }


    //----- methodes ----------------------------------------------------------------------------------------------
    // zie bij electricPokemon voor welke manier ik heb gekozen wb hp verliezen
    int factor = 1;  // initiatie factor, verandert per type tegen type
    int minHp = 0;  // initiatie minHp, is totaal aantal min punten na berekening hpMinInAttack * factor

    public void templateAttackMethod(Pokemon name, Pokemon enemy, String nameAttack, int hpMinInAttack) {
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
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


    public Pokemon getVenusaur() {
        return venusaur;
    }

    public void setVenusaur(Pokemon venusaur) {
        this.venusaur = venusaur;
    }

    public Pokemon getDitto() {
        return ditto;
    }

    public void setDitto(Pokemon ditto) {
        this.ditto = ditto;
    }


}
