public class Main {
    public static void main(String[] args) {
        var p1 = new ProgrammiComputer("Programma1", "Produttore1", "Versione1", "Os1", 2000);
        var p2 = new ProgrammiComputer("Programma2", "Produttore2", "Versione2", "Os2", 2000);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.compareAnno(p2));
        p1.setAnno(2022);
        System.out.println(p1.compareAnno(p2));
    }
}