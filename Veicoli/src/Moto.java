public class Moto extends Veicolo {
    private final String freni;

    public Moto(String targa, String nTelaio, int cilindrata, String marca, String modello, String freni) {
        super(targa, nTelaio, cilindrata, marca, modello);
        this.trazione = trazione;
    }

    public String getFreni() {
        return freni;
    }
}
