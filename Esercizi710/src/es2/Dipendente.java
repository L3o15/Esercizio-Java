package es2;

public class Dipendente {
    private final String nome;
    private double stipendio;

    public Dipendente() {
        nome = "Test";
        stipendio = 1;
    }

    public Dipendente(String nome, double stipendio){
        this.nome = nome;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void raiseSalary(double byPercent){
        stipendio = stipendio + stipendio*byPercent/100;
    }
}

