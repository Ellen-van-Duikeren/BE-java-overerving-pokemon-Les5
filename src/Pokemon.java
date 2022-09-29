import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pokemon {
    // deze variabelen meerdere keren voor
    String type; /*""*/
    List<String> attacks = Arrays.asList("surf", "fireLash", "leafStorm", "hydroPump", "thunderPunch", "electroBall", "solarBeam", "flameThrower", "hydroCanon", "pyroBall", "thunder", "rainDance", "leechSeed", "leaveBlade", "inferno", "voltTackle");  // hier stond voer de aanvallen hier in
    String name;/*""*/
    int level;
    int hp;
    String food;/*""*/
    String sound;/*""*/
    List<Pokemon> pokemons;
    Pokemon raichu;/*⚡*/
    Pokemon charizard;/*🔥*/
    Pokemon venusaur;/*🌿*/
    Pokemon ditto;/*🌿*/
    Pokemon blastoise;/*🌊*/
    Pokemon gyarados;/*🌊*/

    //----- constructor ----------------------------------------------------------------------------------------------


    public Pokemon(List<Pokemon> pokemons) {
        // onderstaande zelf toegevoegd! > werkt niet
        pokemons.add(getBlastoise());
        pokemons.add(getGyarados());
        pokemons.add(getVenusaur());
        pokemons.add(getDitto());
        pokemons.add(getCharizard());
        pokemons.add(getRaichu());
    }

    public Pokemon(String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public Pokemon(String type, List<String> attacks, String name, int level, int hp, String food, String sound) {
        this.type = type;
        this.attacks = attacks;
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public Pokemon(String type, List<String> attacks, String name, int level, int hp, String food, String sound, List<Pokemon> pokemons) {
        this.type = type;
        this.attacks = attacks;
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.pokemons = pokemons;
    }


    //----- methodes ----------------------------------------------------------------------------------------------

    /*deze methode komt op meerdere plaatsen terug*/
    List<String> getAttacks() {
        return attacks;
    }

    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }

//----- gettersNsetters ---------------------------------------------------------------------------------------


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
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
