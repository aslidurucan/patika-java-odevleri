package taksimetre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double KM_UCRETI = 2.20;
        final double ACILIS_UCRETI = 10.0;
        final double MINIMUM_UCRET = 20.0;

        System.out.print("Gidilen mesafeyi girin (KM): ");
        double km = scanner.nextDouble();

        double tutar = ACILIS_UCRETI + (km * KM_UCRETI);

        if (tutar < MINIMUM_UCRET) {
            tutar = MINIMUM_UCRET;
        }

        System.out.println("Gidilen Mesafe : " + km + " KM");
        System.out.printf("Taksimetre Tutarı: %.2f TL%n", tutar);

        scanner.close();
    }
}