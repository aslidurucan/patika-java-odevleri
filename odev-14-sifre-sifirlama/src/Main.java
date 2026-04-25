package sifresifirlama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String mevcutSifre = "1234"; // Sistemdeki kayıtlı şifre

        System.out.print("Şifrenizi giriniz: ");
        String girilenSifre = scanner.nextLine();

        if (girilenSifre.equals(mevcutSifre)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Şifre yanlış!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            String cevap = scanner.nextLine();

            if (cevap.equals("evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = scanner.nextLine();

                if (yeniSifre.equals(mevcutSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Şifre sıfırlama iptal edildi.");
            }
        }

        scanner.close();
    }
}