package mdp2026.pokedex.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import mdp2026.pokedex.model.Pokedex;
import mdp2026.pokedex.model.Pokemon;
import mdp2026.pokedex.utility.ResourceReader;
import mdp2026.pokedex.utility.TextInput;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class PokedexLoader extends ResourceReader implements TextInput {
    private final Gson gson = new Gson();
    private static final String FILE_PATH = "data.json";

    /**
     * Implementazione obbligatoria dell'interfaccia TextInput.
     * Utilizza il metodo ereditato da ResourceReader.
     */
    @Override
    public String readInput() {
        return leggiFile(FILE_PATH);
    }

    /**
     * Carica la lista di Pokemon e la incapsula in un oggetto Pokedex.
     */
    public Pokedex caricaPokedex() {
        String json = readInput();

        // Usiamo TypeToken perché il JSON inizia con '[' (un array)
        Type listType = new TypeToken<ArrayList<Pokemon>>() {}.getType();
        List<Pokemon> listaPokemon = gson.fromJson(json, listType);

        // Creiamo il Pokedex passando la lista al costruttore
        return new Pokedex(listaPokemon);
    }
}