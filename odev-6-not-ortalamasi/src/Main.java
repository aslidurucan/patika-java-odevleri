package notortalamasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        int matematik = scanner.nextInt();

        System.out.print("Fizik notu: ");
        int fizik = scanner.nextInt();

        System.out.print("Kimya notu: ");
        int kimya = scanner.nextInt();

        System.out.print("Türkçe notu: ");
        int turkce = scanner.nextInt();

        System.out.print("Tarih notu: ");
        int tarih = scanner.nextInt();

        System.out.print("Müzik notu: ");
        int muzik = scanner.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;

        System.out.println("Notlar: Matematik=" + matematik + " Fizik=" + fizik + " Kimya=" + kimya + " Türkçe=" + turkce + " Tarih=" + tarih + " Müzik=" + muzik);
        System.out.printf("Ortalama: %.2f%n", ortalama);

        String sonuc = ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Sonuç: " + sonuc);

        scanner.close();
    }
}