package mdp2026.pokedex.model;

public class Pokemon {
    private final int numero;
    private final String nome;
    private final Tipo tipo1;
    private final Tipo tipo2;
    private final float altezza;
    private final float peso;
    private boolean isDiscovered;

    public Pokemon(int numero, String nome, Tipo tipo1, Tipo tipo2, float altezza, float peso) {
        this.numero = numero;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.altezza = altezza;
        this.peso = peso;
        this.isDiscovered = false;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Tipo getTipo1() {
        return tipo1;
    }

    public Tipo getTipo2() {
        return tipo2;
    }

    public float getAltezza() {
        return altezza;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isDiscovered() {
        return isDiscovered;
    }

    public void setDiscovered(boolean discovered) {
        isDiscovered = discovered;
    }

    @Override
    public String toString() {
        return String.format("%d - %s (Tipo: %s/%s, Altezza: %.2f m, Peso: %.2f kg)", numero, nome, tipo1, tipo2,
                altezza,
                peso);
    }
}
