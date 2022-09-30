import java.util.Arrays;
import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    String name;
    // hier lijst laten staan volgens les en in trainer
    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }


//----- constructor ----------------------------------------------------------------------------------------------


    public PokemonGymOwner(String name) {
        super(name);
        this.name = name;
    }

    public PokemonGymOwner(String name, ElectricPokemon raichu, GrassPokemon venusaur, GrassPokemon ditto, FirePokemon charizard, WaterPokemon blastoise, WaterPokemon gyarados) {
        super(name, raichu, venusaur, ditto, charizard, blastoise, gyarados);
        this.name = name;
    }

//----- methodes ----------------------------------------------------------------------------------------------

//----- gettersNsetters ---------------------------------------------------------------------------------------


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
