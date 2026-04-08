package mdp2026.pokedex.model;

import java.util.List;

public class Pokedex {
    private final List<Pokemon> pokemonList;

    public Pokedex(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public Pokemon getPokemonById(int id) {
        if (id < 1 || id > pokemonList.size())
            throw new IllegalArgumentException("ID del Pokémon non valido: " + id);
        if (pokemonList.get(id - 1).isDiscovered())
            throw new IllegalStateException("Il Pokémon con ID " + id + " è già stato scoperto.");
        return pokemonList.get(id - 1);
    }

    public void discoverPokemon(int id) {
        Pokemon pokemon = getPokemonById(id);
        pokemon.setDiscovered(true);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pokemon p : pokemonList) {
            if (p.isDiscovered())
                sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
