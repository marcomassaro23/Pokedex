package mdp2026.pokedex;

import org.checkerframework.checker.units.qual.s;

import mdp2026.pokedex.model.Pokedex;
import mdp2026.pokedex.service.PokedexLoader;

public class App {
    public static void main(String[] args) {
        try {
            Pokedex pokedex = new PokedexLoader().caricaPokedex();
            System.out.println("Pokedex caricato con successo!");
            System.out.println(pokedex);
            System.out.println("Scoperta del Pokemon con ID 78...");
            pokedex.discoverPokemon(78);
            for (int id = 1; id <= 76; id++) {
                pokedex.discoverPokemon(id);
            }
            System.out.println("Pokemon scoperto!");
            System.out.println(pokedex);
        } catch (RuntimeException e) {
            System.err.println("Errore fatale: " + e.getMessage());
        }
    }
}
