import java.util.Arrays;
import java.util.List;

public class PokemonTrainer {
    String name;
    List<Pokemon> Pokemons;

    ElectricPokemon raichu = new ElectricPokemon("Raichu", 45, 35, "thunders", "BOOOM");/*⚡*/
    GrassPokemon venusaur = new GrassPokemon("Venusaur", 5, 70,"seeds", "grumble");/*🌿*/
    GrassPokemon ditto = new GrassPokemon("Ditto", 35, 85, "trees", "sssssssh");/*🌿*/
    FirePokemon charizard = new FirePokemon("Charizard", 15, 60, "lava", "rommeldebommel");/*🔥*/
    WaterPokemon blastoise = new WaterPokemon("Blastoise", 20, 70, "hurricanes", "whoosh");/*🌊*/
    WaterPokemon gyarados = new WaterPokemon("Gyarados", 30, 89, "cyclons", "what?");/*🌊*/

    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }

//----- constructor -------------------------------------------------------------------------------------------
    public PokemonTrainer(String name) {
        this.name = name;
    }


//----- methodes ----------------------------------------------------------------------------------------------

//----- gettersNsetters ---------------------------------------------------------------------------------------

    public String getName() {
        return name;
    }

    public Pokemon getRaichu() {
        return raichu;
    }

    public Pokemon getVenusaur() {
        return venusaur;
    }

    public Pokemon getDitto() {
        return ditto;
    }

    public Pokemon getCharizard() {
        return charizard;
    }

    public Pokemon getBlastoise() {
        return blastoise;
    }

    public Pokemon getGyarados() {
        return gyarados;
    }

    public List<Pokemon> getPokemons() {
        return Pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        Pokemons = pokemons;
    }
}
