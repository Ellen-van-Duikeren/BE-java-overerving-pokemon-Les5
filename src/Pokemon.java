import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pokemon {
    // deze variabelen meerdere keren voor
    private final String type; /*""*/
    private final String name;/*""*/
    int level;
    int hp;
    private final String food;/*""*/
    private final String sound;/*""*/
    List<Pokemon> pokemons;
    Pokemon raichu;/*⚡*/
    Pokemon charizard;/*🔥*/
    Pokemon venusaur;/*🌿*/
    Pokemon ditto;/*🌿*/
    Pokemon blastoise;/*🌊*/
    Pokemon gyarados;/*🌊*/

    //----- constructor ----------------------------------------------------------------------------------------------

    public Pokemon(String type, String name, String food, String sound) {
        this.type = type;
        this.name = name;
        this.food = food;
        this.sound = sound;
    }

//    pokemon.getName(), pokemon.getLevel(), pokemon.getHp(), pokemon.getFood(), pokemon.getSound()

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

    public void setLevel(int level) {
        this.level = level;
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

    public Pokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(Pokemon raichu) {
        this.raichu = raichu;
    }

    public Pokemon getCharizard() {
        return charizard;
    }

    public void setCharizard(Pokemon charizard) {
        this.charizard = charizard;
    }

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
