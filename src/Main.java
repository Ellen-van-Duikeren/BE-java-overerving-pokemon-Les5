import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner speler_A = new Scanner(System.in);
        PokemonGymImpl pokemonGym = new PokemonGymImpl();
        System.out.println("First player please enter your name: ");
        String userA = speler_A.nextLine();
        PokemonTrainer player1 = new PokemonTrainer(userA);
        List<Pokemon> names = new ArrayList<>();
        names.add(player1.getBlastoise());
        names.add(player1.getGyarados());
        names.add(player1.getCharizard());
        names.add(player1.getDitto());
        names.add(player1.getRaichu());
        names.add(player1.getVenusaur());
        player1.setPokemons(names);
        System.out.println("To start your game, we have given you 6 Pokemons you can use");
        System.out.println("these are the Pokemons you get:");
        pokemonGym.printPokemon(names);
        System.out.println("Would you like to enter a gym looking for a fight?");
        System.out.println("Please enter yes or no");
        if (speler_A.nextLine().equals("yes")) {
            pokemonGym.enteredTheGym(player1);
        }

//void printPokemon(List<Pokemon> pokemons);
//Pokemon selectPokemon(String pokemon, PokemonTrainer trainer);
//void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon);
//Pokemon chooseGymPokemon(PokemonGymOwner gymOwner);
//Pokemon choosePokemon(PokemonTrainer trainer);
//int randomAttackByGymOwner();
//String chooseAttackPlayer(Pokemon p);
//void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack);
//void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon);
//void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gym);


    }
}

