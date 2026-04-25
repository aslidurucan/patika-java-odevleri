package kdvhesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Fiyatı girin: ");
        double fiyat = scanner.nextDouble();

        double kdvOrani;

        if (fiyat <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        double kdvliFiyat = fiyat * (1 + kdvOrani);
        double kdvTutari = kdvliFiyat - fiyat;

        System.out.println("KDV'siz Fiyat : " + fiyat + " TL");
        System.out.printf("KDV Oranı     : %%%d%n", (int)(kdvOrani * 100));
        System.out.printf("KDV Tutarı    : %.2f TL%n", kdvTutari);
        System.out.printf("KDV'li Fiyat  : %.2f TL%n", kdvliFiyat);

        scanner.close();
    }
}