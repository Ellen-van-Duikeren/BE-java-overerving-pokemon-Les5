import java.util.List;

public class PokemonGymOwner {
    String name;
    List<Pokemon> pokemons;
    Pokemon raichu;/*⚡*/
    Pokemon charizard;/*🔥*/
    Pokemon venusaur;/*🌿*/
    Pokemon ditto;/*🌿*/
    Pokemon blastoise;/*🌊*/
    Pokemon gyarados;/*🌊*/


//----- constructor ----------------------------------------------------------------------------------------------


    public PokemonGymOwner(String name) {
        this.name = name;
    }

    public PokemonGymOwner(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }


    public PokemonGymOwner(String name, Pokemon raichu, Pokemon charizard, Pokemon venusaur, Pokemon ditto, Pokemon blastoise, Pokemon gyarados) {
        this.name = name;
        this.raichu = raichu;
        this.charizard = charizard;
        this.venusaur = venusaur;
        this.ditto = ditto;
        this.blastoise = blastoise;
        this.gyarados = gyarados;
    }

    public PokemonGymOwner(String name, List<Pokemon> pokemons, Pokemon raichu, Pokemon charizard, Pokemon venusaur, Pokemon ditto, Pokemon blastoise, Pokemon gyarados) {
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
