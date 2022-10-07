package es4;

public class Orario {
    private final int secondi;

    public Orario(int secondi) {
        this.secondi = secondi;
    }

    public int getSecondi(){
        return secondi;
    }

    public int getMinuti(){
        return secondi/60;
    }

    public int getOre(){
        return getMinuti()/60;
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", getOre(), getMinuti()%60, getSecondi()%60);
    }
}
