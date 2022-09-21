public class Veicolo {
    private final String targa;
    private final String nTelaio;
    private final int cilindrata;
    private final String marca;
    private final String modello;

    public Veicolo(String targa, String nTelaio, int cilindrata, String marca, String modello) {
        this.targa = targa;
        this.nTelaio = nTelaio;
        this.cilindrata = cilindrata;
        this.marca = marca;
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public String getnTelaio() {
        return nTelaio;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }
}

