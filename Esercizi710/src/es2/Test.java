package es2;

public class Test {
    public static void main(String[] args) {
        var d1 = new Dipendente();
        var d2 = new Dipendente("A", 100);

        System.out.println(d1.getNome());
        System.out.println("Stipendio: " + d1.getStipendio());
        System.out.println(d2.getNome());
        System.out.println("Stipendio: " + d2.getStipendio());
        d2.raiseSalary(10);
        System.out.println("Stipendio: " + d2.getStipendio());
    }
}
