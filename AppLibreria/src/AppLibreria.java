import java.util.Scanner;
import java.util.Vector;
public class AppLibreria {
    public static void main(String[] args) {
        var sc1 = new Scanner(System.in);
        System.out.print("Inserire la dimensione della mensola: ");
        var dim = sc1.nextInt();
        var mensola = new Mensola(dim);
        int scelta = 0;
        do{
            System.out.println("1_ Aggiungi libro");
            System.out.println("2_ Rimuovi libro");
            System.out.println("3_ Stampa mensola");
            System.out.println("4_ Numero libri sulla mensola");
            //System.out.println("5_ Ordina libri per titolo");
            System.out.println("0_ Esci");


            scelta = sc1.nextInt();

            switch (scelta){
                case 1:
                    var sc2 = new Scanner(System.in);
                    System.out.print("Inserire il titolo: ");
                    var t = sc2.nextLine();
                    System.out.print("Inserire l'autore: ");
                    var a = sc2.nextLine();
                    System.out.print("Inserire il numero di pagine: ");
                    var n = sc2.nextInt();
                    System.out.print("Inserire la posizione in cui mettere il libro: ");
                    var pos = sc2.nextInt();
                    var l = new Libro(t,a,n);
                    if(mensola.add(l,pos)){
                        System.out.println("Libro aggiunto");
                    }else{
                        System.out.println("Libro non aggiunto");
                    }
                    break;
                case 2:
                    var sc3 = new Scanner(System.in);
                    System.out.print("Inserire la posizione da cui rimuovere il libro: ");
                    var p = sc3.nextInt();
                    if(mensola.remove(p) == null){
                        System.out.println("Libro non rimosso");
                    }else{
                        System.out.println("Libro rimosso");
                    }
                    break;
                case 3:
                    System.out.println(mensola);
                    break;
                case 4:
                    System.out.println(mensola.nLibri());
                    break;
                //case 5:
                    //mensola.sort();
                    //break;
            }
        }while (scelta!=0);
    }
}