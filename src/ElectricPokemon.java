import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class ElectricPokemon extends Pokemon {
    private Pokemon raichu;


//----- constructor ----------------------------------------------------------------------------------------------

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    public ElectricPokemon(String type, List<String> attacks, String name, int level, int hp, String food, String sound, Pokemon raichu) {
        super(type, attacks, name, level, hp, food, sound);
        this.raichu = raichu;
    }

    public ElectricPokemon(String type, List<String> attacks, String name, int level, int hp, String food, String sound, List<Pokemon> pokemons, Pokemon raichu) {
        super(type, attacks, name, level, hp, food, sound, pokemons);
        this.raichu = raichu;
    }


//----- methodes ----------------------------------------------------------------------------------------------
    //  Bij Pokémons is het zo dat het type bepalend is voor hoe zwaar de schade is. Hieronder vind je een overzichtje voor een logica van schade bij aanvallen:
    //- Het type fire🔥 doet de meeste schade aan grass-pokémons🌿, daarna aan water-pokémons🌊, dan de electric-pokémons⚡ en het minste bij fire-pokémons🔥.
    //- Het type grass🌿 doet de meeste schade aan electric-pokémons⚡, daarna aan fire-pokémons🔥, dan de water-pokémons🌊 en het minste bij grass-pokémons🌿.
    //- Het type electric⚡ doet de meeste schade aan water-pokémons🌊, daarna aan grass-pokémons🌿, dan de fire-pokémons 🔥en het minste bij electric-pokémons⚡.
    //- Het type water🌊 doet de meeste schade aan fire-pokémons🔥, daarna aan electric-pokémons⚡, dan de grass-pokémons🌿 en het minste bij water-pokémons🌊.

    //    5. De aanval-methodes moeten de volgende eigenschappen hebben:
    //  - een `system.out.println` die vertelt wie wie aanvalt met welke aanval (concatenation met variabelen, b.v.: "Bulbasaur attacks Charizard with leafStorm");
    //  - een beslissingstructuur die kijkt welk type de vijand heeft;
    //  - aan de hand van de beslissingstructuur moet de vijand hp punten verliezen (per type verschilt het aantal punten);
    //  - een `system.out.println` die aangeeft wat de aanval voor effect heeft (concatenation met variabelen, b.v.: "Charizard loses 15 hp");
    //  - vergeet de hp van de vijand niet te verlagen;
    //  - sluit de methode af met een `system.out.println` die de resteren hp waarde weergeeft van de vijand;

    // aangezien in pokemon wiki niet wordt aangegeven hoeveel hp een pokemon verliest maar dit daar veel ingewikkelder ligt, heb ik mijn eigen systeem bedacht. Volgens SME-er mag je zelf het aantal min hp bepalen. Dus nu geef ik in de methode het aantal minhp mee (1, 2 of 3 heb ik bedacht) en afh van welk type tegen welk type geef ik een factor mee. Dus bijvoorbeeld: minHp  Het type fire🔥 doet de meeste schade aan grass-pokémons🌿 > factor 4, dus min 8 hp, daarna aan water-pokémons🌊 > factor 3 = min 6 hp, dan de electric-pokémons⚡ > factor 2 = min 4 hp en het minste bij fire-pokémons🔥 > factor 1 = min 2 hp.
    int factor = 1;  // initiatie factor, verandert per type tegen type
    int minHp = 0;  // initiatie minHp, is totaal aantal min punten na berekening hpMinInAttack * factor

    // onderstaande methode is een methode die ik in elk van de lectricPokemons toepas. Deze is weer anders voor de WaterPokemon enz omdat de factor anders is.
    public void templateAttackMethod(Pokemon name, Pokemon enemy, String nameAttack, int hpMinInAttack) {
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        switch (enemy.getType()) {
            case "electric":
                factor = 1;
                break;
            case "fire":
                factor = 2;
                break;
            case "grass":
                factor = 3;
                break;
            case "water":
                factor = 4;
                break;
            default:
                factor = 1;
        }
        minHp = hpMinInAttack * factor;
        enemy.setHp(enemy.getHp() - (minHp));
        System.out.println(enemy.getName() + " loses " + minHp + " hp and has now " + enemy.getHp() + "hp.");
    }

    void thunderPunch(Pokemon name, Pokemon enemy) { // electric
        int hpMinInAttack = 1;
        String nameAttack = "thunderpunch";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void electroBall(Pokemon name, Pokemon enemy) { // electric
        int hpMinInAttack = 2;
        String nameAttack = "electroBall";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void thunder(Pokemon name, Pokemon enemy) { // electric
        int hpMinInAttack = 2;
        String nameAttack = "thunder";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    void voltTackle(Pokemon name, Pokemon enemy) {  // electric
        int hpMinInAttack = 3;
        String nameAttack = "voltTackle";
        System.out.println(name + " valt " + enemy + " aan, met " + nameAttack + ".");
        templateAttackMethod(name, enemy, nameAttack, hpMinInAttack);
    }

    //----- gettersNsetters ---------------------------------------------------------------------------------------
    public Pokemon getRaichu() {
        return raichu;
    }

    public void setRaichu(Pokemon raichu) {
        this.raichu = raichu;
    }
}
