public class Televisore {
    private int pollici;
    private String colore;
    private int canale;
    private int volume;
    private int luminosita;
    private boolean acceso;

    public Televisore(int pollici, String colore) {
        this.pollici = pollici;
        this.colore = colore;
        canale = 1;
        volume = 15;
        luminosita = 5;
        acceso = false;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void accendi() {
        if (acceso){
            acceso = false;
        }else{
            acceso = true;
        }
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void addLuminosita() {
        if (luminosita < 10 && luminosita >= 0) {
            luminosita = luminosita + 1;
        }
    }

    public void subLuminosita() {
        if (luminosita <= 10 && luminosita > 0) {
            luminosita = luminosita - 1;
        }
    }

    public int getPollici() {
        return pollici;
    }

    public String getColore() {
        return colore;
    }

    public int getCanale() {
        return canale;
    }

    public void addCanale() {
        canale = canale + 1;
    }

    public void subCanale() {
        if (canale > 0) {
            canale = canale - 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void addVolume() {
        if (volume >= 0 && volume < 100) {
            volume = volume + 5;
        }
    }

    public void subVolume() {
        if (volume > 0 && volume <= 100) {
            volume = volume - 5;
        }
    }
}
