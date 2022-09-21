public class Automobile extends Veicolo {
    private final String trazione;

    public Automobile(String targa, String nTelaio, int cilindrata, String marca, String modello, String trazione) {
        super(targa, nTelaio, cilindrata, marca, modello);
        this.trazione = trazione;
    }

    public String getTrazione() {
        return trazione;
    }
}
