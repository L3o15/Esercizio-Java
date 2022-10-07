package es1;

import java.util.Scanner;

public class UsoCerchio {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("R1:");
        double r1 = scanner.nextDouble();

        System.out.println("R2:");
        double r2 = scanner.nextDouble();

        var c1 = new Cerchio(r1);

        var c2 = new Cerchio(r2);

        System.out.println("Perimetro:" + c1.perimetro());
        System.out.println("Diametro:" + c1.diametro());
        System.out.println("Area:" + c1.area());
        System.out.println();

        System.out.println("Perimetro:" + c2.perimetro());
        System.out.println("Diametro:" + c2.diametro());
        System.out.println("Area:" + c2.area());
        System.out.println();

        var c3 = c1.sommaCerchio(c2);
        System.out.println("Perimetro:" + c3.perimetro());
        System.out.println("Diametro:" + c3.diametro());
        System.out.println("Area:" + c3.area());

    }
}
