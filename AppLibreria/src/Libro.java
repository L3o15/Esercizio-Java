public class Libro {
    private final String titolo;
    private final String autore;
    private final int nPagine;

    public Libro(String titolo, String autore, int nPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.nPagine = nPagine;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getnPagine() {
        return nPagine;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", nPagine=" + nPagine +
                '}';
    }
}
