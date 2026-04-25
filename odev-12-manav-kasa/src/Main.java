package manavkasa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double ARMUT_FIYAT = 2.14;
        final double ELMA_FIYAT = 3.67;
        final double DOMATES_FIYAT = 1.11;
        final double MUZ_FIYAT = 0.95;
        final double PATLICAN_FIYAT = 5.00;

        System.out.print("Armut Kaç Kilo ? :");
        double armut = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        double elma = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        double domates = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        double muz = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        double patlican = scanner.nextDouble();

        double toplam = (armut * ARMUT_FIYAT) +
                (elma * ELMA_FIYAT) +
                (domates * DOMATES_FIYAT) +
                (muz * MUZ_FIYAT) +
                (patlican * PATLICAN_FIYAT);

        System.out.printf("Toplam Tutar : %.2f TL%n", toplam);

        scanner.close();
    }
}