package aktiviteoneri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklığı giriniz: ");
        int sicaklik = scanner.nextInt();

        // ÇÖZÜM 1 - if-else if
        System.out.println("--- Çözüm 1: if-else if ---");
        if (sicaklik < 5) {
            System.out.println("Kayak");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinema");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Piknik");
        } else {
            System.out.println("Yüzme");
        }

        // ÇÖZÜM 2 - Ternary Operator
        System.out.println("--- Çözüm 2: Ternary ---");
        String aktivite = sicaklik < 5 ? "Kayak" :
                sicaklik <= 15 ? "Sinema" :
                sicaklik <= 25 ? "Piknik" : "Yüzme";
        System.out.println(aktivite);

        // ÇÖZÜM 3 - Switch Expression (Java 14+)
        System.out.println("--- Çözüm 3: Switch ---");
        String sonuc;
        if (sicaklik < 5) sonuc = "Kayak";
        else if (sicaklik <= 15) sonuc = "Sinema";
        else if (sicaklik <= 25) sonuc = "Piknik";
        else sonuc = "Yüzme";
        System.out.println(sonuc);

        scanner.close();
    }
}