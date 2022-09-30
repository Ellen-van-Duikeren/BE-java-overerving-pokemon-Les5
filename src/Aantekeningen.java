/* Aantekeningen
## Stappenplan

1. Maak de volgende klassen aan:
   - Pokemon (`abstract`)
   - FirePokemon
   - WaterPokemon
   - GrassPokemon
   - ElectricPokemon
   - PokemonGym (`interface`)
   - PokemonGymImpl
   - PokemonGymOwner
   - PokemonTrainer
Gedaan

2. In de klasse `Variabelen` staan verschillende variabelen met tips. Plaats deze in de juiste klassen, die je zojuist hebt aangemaakt en geef ze de juiste datatypen.
Gedaan, alleen  List<Pokemon> pokemons weet ik niet waar die hoort. Nu ondergebracht bij Pokemon, aangezien het om een list van ws meerdere pokemons gaat

3. Geef alle variabelen getters en setters als ze in de juiste klasse staan.
Gedaan

4. In de klasse `Methodes` staan de methodes die minimaal gebruikt moeten worden binnen de applicatie. Verplaats deze naar de juiste klassen.
    Tip: om de methodes te verdelen, kij dan goed naar wat intelliJ zegt. Bijv bij getBlastoise in main, zegt IntelliJ: create method getBlastoise in Pokemontrainer
    Gedaan:
    - De volgende 16 methodes zijn aanvallen > naar de verschillende types verplaatst
    - Deze methode komt op meerdere plaatsen terug > in Pokemon geplaatst
    - Deze methodes mogen geïmplementeerd worden in de interface > methodes als abstracte methodes in PokemonGym geplaatst en de hele methode in PokemonGymImpl > gedaan
    - getBlastoise()), getGyarados()), getCharizard()), getDitto()), getRaichu()), getVenusaur()) > volgens IntelliJ naar PokemonTrainer
    -   setPokemons(names) > volgens IntelliJ naar PokemonTrainer
    -  printPokemon(names), enteredTheGym(player1) > volgens intelliJ naar PokemonGymImpl > in eerste instantie gaf ie dit aan, maar later niet meer > niks mee gedaan
Gedaan

5. De aanval-methodes moeten de volgende eigenschappen hebben:
  - een `system.out.println` die vertelt wie wie aanvalt met welke aanval (concatenation met variabelen, b.v.: "Bulbasaur attacks Charizard with leafStorm");
  - een beslissingstructuur die kijkt welk type de vijand heeft;
  - aan de hand van de beslissingstructuur moet de vijand hp punten verliezen (per type verschilt het aantal punten);
  - een `system.out.println` die aangeeft wat de aanval voor effect heeft (concatenation met variabelen, b.v.: "Charizard loses 15 hp");
  - vergeet de hp van de vijand niet te verlagen;
  - sluit de methode af met een `system.out.println` die de resteren hp waarde weergeeft van de vijand;
Gedaan

6. De volgende methodes hebben nog een extra functie:
  - `rainDance` heeft geen effect op electric Pokemons maar geeft een `system.out.println` met de boodschap: "has no effect on (vijand)";
  - `rainDance` levert een hp boost aan vijanden grass-types;
  - `tunder` levert een hp boost aan electric Pokemons;
  - `leechSeed` trekt hp van de vijand af en geeft deze hp aan de aanvallende Pokémon terug;
Nog volledig doen

7. Plaats de methodes in de interface zonder uitwerking. Dus alleen het returntype, naam, datatypes van de parameters en de parameters van de methode.
Gedaan

8. Plaats gehele methodes in de implementatie van de interface. Vergeet de `@Override` niet.
Gedaan

Zelf bedacht:
9. Alle types Pokemons moeten objecten = Pokemons worden ipv Strings; en ik moet Pokemon en Pokemontrainer hier weer op aanpassen
Gedaan

10. Alle foutmeldingen in main doorlopen en opgelost
Gedaan


11. Alle foutmeldingen in PokemonGymImpl doorlopen en opgelost
Gedaan

12. aanvallen nog invullen cf 5
Gedaan

13. extra functies implementeren
   -done: 'rainDance` heeft geen effect op electric Pokemons maar geeft een `system.out.println` met de boodschap: "has no effect on (vijand)";
  - done: 'rainDance` levert een hp boost aan vijanden grass-types;
  - `tunder` levert een hp boost aan electric Pokemons;
  - `leechSeed` trekt hp van de vijand af en geeft deze hp aan de aanvallende Pokémon terug;

 Nog doen
14. checken randvoorwaarden
15. bonusopdrachten
17. variabele village nog toevoegen?
18. opschonen alle constructors, gettersNsetters die ik niet gebruik

 */






