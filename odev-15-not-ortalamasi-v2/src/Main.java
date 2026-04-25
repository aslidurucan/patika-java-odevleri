package notortalamasiv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int GECME_NOTU = 55;

        System.out.print("Matematik notu: ");
        int matematik = scanner.nextInt();

        System.out.print("Fizik notu: ");
        int fizik = scanner.nextInt();

        System.out.print("Türkçe notu: ");
        int turkce = scanner.nextInt();

        System.out.print("Kimya notu: ");
        int kimya = scanner.nextInt();

        System.out.print("Müzik notu: ");
        int muzik = scanner.nextInt();

        int toplam = 0;
        int dersAdedi = 0;

        if (matematik >= 0 && matematik <= 100) { toplam += matematik; dersAdedi++; }
        if (fizik >= 0 && fizik <= 100) { toplam += fizik; dersAdedi++; }
        if (turkce >= 0 && turkce <= 100) { toplam += turkce; dersAdedi++; }
        if (kimya >= 0 && kimya <= 100) { toplam += kimya; dersAdedi++; }
        if (muzik >= 0 && muzik <= 100) { toplam += muzik; dersAdedi++; }

        if (dersAdedi == 0) {
            System.out.println("Geçerli not girilmedi!");
        } else {
            double ortalama = (double) toplam / dersAdedi;
            System.out.printf("Ortalama: %.2f%n", ortalama);
            String sonuc = ortalama >= GECME_NOTU ? "Sınıfı Geçti" : "Sınıfta Kaldı";
            System.out.println("Sonuç: " + sonuc);
        }

        scanner.close();
    }
}