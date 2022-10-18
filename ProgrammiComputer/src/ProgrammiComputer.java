/***
 * Classe per la gestione delle informazioni di un programma per computer
 * @author Leonardo Orizio 4DI
 * */
public class ProgrammiComputer {
    /***
     * Nome del programma
     * */
    private String denominazione;
    /***
     * Nome del produttore
     * */
    private String produttore;
    /***
     * Versione del programma
     * */
    private String versione;
    /***
     * Sistema operativo su cui è supportata
     * */
    private String sistemaOperativo;
    /***
     * Anno di release
     * */
    private int anno;

    /***
     * Costruttore con parametri
     * */
    public ProgrammiComputer(String denominazione, String produttore, String versione, String sistemaOperativo, int anno) {
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.sistemaOperativo = sistemaOperativo;
        this.anno = anno;
    }
    /***
     * Costruttore di copia
     * */
    public ProgrammiComputer ProgrammiComputer(ProgrammiComputer programmiComputer){
        return programmiComputer;
    }
    /***
     * Getter della denominazione
     * */
    public String getDenominazione() {
        return denominazione;
    }
    /***
     * Setter della denominazione
     * */
    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }
    /***
     * Getter del produttore
     * */
    public String getProduttore() {
        return produttore;
    }
    /***
     * Setter del produttore
     * */
    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }
    /***
     * Getter della versione
     * */
    public String getVersione() {
        return versione;
    }
    /***
     * Setter della versione
     * */
    public void setVersione(String versione) {
        this.versione = versione;
    }
    /***
     * Getter del sistema operativo
     * */
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    /***
     * Setter della sistema operativo
     * */
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    /***
     * Getter dell'anno
     * */
    public int getAnno() {
        return anno;
    }
    /***
     * Setter dell'anno
     * */
    public void setAnno(int anno) {
        this.anno = anno;
    }
    /***
     * Metodo toString
     * */
    @Override
    public String toString() {
        return "ProgrammiComputer{" +
                "denominazione='" + denominazione + '\'' +
                ", produttore='" + produttore + '\'' +
                ", versione='" + versione + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", anno=" + anno +
                '}';
    }
    /***
     * Metodo per comparare l'anno di produzione del programma dal quale si chiama il metodo con quello del parametro del metodo
     * */
    public boolean compareAnno(ProgrammiComputer p){
        return anno == p.getAnno();
    }
}
