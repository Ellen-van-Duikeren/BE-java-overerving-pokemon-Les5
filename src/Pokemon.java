import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleToIntFunction;

public class Pokemon {
    // deze variabelen meerdere keren voor
    private final String type; /*""*/
    private final String name;/*""*/
    int level;
    int hp;
    private final String food;/*""*/
    private final String sound;/*""*/
    List<Pokemon> pokemons;

    int factor = 1;  // wordt gebruikt in de attacks, initiatie factor, verandert per type tegen type
    int minHp = 0;  // wordt gebruikt in de attacks, initiatie minHp, is totaal aantal min punten na berekening hpMinInAttack * factor


// constructor ----------------------------------------------------------------------------------------------

    public Pokemon(String type, String name, String food, String sound) {
        this.type = type;
        this.name = name;
        this.food = food;
        this.sound = sound;
    }

    public Pokemon(String type, String name, int level, int hp, String food, String sound) {
        this.type = type;
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }


//----- methodes ----------------------------------------------------------------------------------------------

//----- gettersNsetters ---------------------------------------------------------------------------------------
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
