import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {
    String name;
    Pokemon raichu = new Pokemon("Raichu", 2, 80, "thunders", "BOOOM");/*⚡*/
    Pokemon venusaur = new Pokemon("Venusaur", 8, 88, "seeds", "grumble");/*🌿*/
    Pokemon ditto = new Pokemon("Ditto", 3, 56, "trees", "sssssssh");/*🌿*/
    Pokemon charizard = new Pokemon("Charizard", 5, 50, "lava", "rommeldebommel");/*🔥*/
    Pokemon blastoise = new Pokemon("Blastoise", 3, 75, "hurricanes", "whoosh");/*🌊*/
    Pokemon gyarados = new Pokemon("Gyarados", 5, 60, "cyclons", "what?");/*🌊*/
    //    List<Pokemon> pokemons;
    List<Pokemon> pokemons = Arrays.asList(raichu, venusaur, ditto, charizard, blastoise, gyarados);

    //----- constructor -------------------------------------------------------------------------------------------

    public PokemonTrainer(String name) {
        this.name = name;
    }

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public PokemonTrainer(String name, Pokemon raichu, Pokemon charizard, Pokemon venusaur, Pokemon ditto, Pokemon blastoise, Pokemon gyarados) {
        this.name = name;
        this.raichu = raichu;
        this.charizard = charizard;
        this.venusaur = venusaur;
        this.ditto = ditto;
        this.blastoise = blastoise;
        this.gyarados = gyarados;
    }

    public PokemonTrainer(String name, List<Pokemon> pokemons, Pokemon raichu, Pokemon charizard, Pokemon venusaur, Pokemon ditto, Pokemon blastoise, Pokemon gyarados) {
        this.name = name;
        this.pokemons = pokemons;
        this.raichu = raichu;
        this.charizard = charizard;
        this.venusaur = venusaur;
        this.ditto = ditto;
        this.blastoise = blastoise;
        this.gyarados = gyarados;
    }

    //----- methodes ----------------------------------------------------------------------------------------------

//----- gettersNsetters ---------------------------------------------------------------------------------------


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(Pokemon raichu) {
        this.raichu = raichu;
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

    public Pokemon getCharizard() {
        return charizard;
    }

    public void setCharizard(Pokemon charizard) {
        this.charizard = charizard;
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

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
