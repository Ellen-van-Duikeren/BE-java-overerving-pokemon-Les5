import java.util.Arrays;
import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    public List<Pokemon> getPokemonList() {
        return Arrays.asList(getCharizard(), getBlastoise(), getDitto(), getGyarados(), getRaichu(), getVenusaur());
    }


//----- constructor ----------------------------------------------------------------------------------------------
    public PokemonGymOwner(String name) {
        super(name);
        this.name = name;
    }

//----- methodes ----------------------------------------------------------------------------------------------

//----- gettersNsetters ---------------------------------------------------------------------------------------
}
