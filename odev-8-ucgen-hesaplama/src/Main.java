package ucgenhesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Hipotenüs hesaplama
        System.out.print("1. dik kenar uzunluğunu girin (a): ");
        double a = scanner.nextDouble();

        System.out.print("2. dik kenar uzunluğunu girin (b): ");
        double b = scanner.nextDouble();

        double hipotenüs = Math.sqrt(a * a + b * b);
        System.out.printf("Hipotenüs: %.2f%n", hipotenüs);

        // Üçgen alanı hesaplama (Heron Formülü)
        System.out.print("3. kenar uzunluğunu girin (c): ");
        double c = scanner.nextDouble();

        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.printf("Üçgenin Çevresi: %.2f%n", 2 * u);
        System.out.printf("Üçgenin Alanı  : %.2f%n", alan);

        scanner.close();
    }
}