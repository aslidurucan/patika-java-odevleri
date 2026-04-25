package dairehesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Yarıçapı girin (r): ");
        double r = scanner.nextDouble();

        double alan = PI * r * r;
        double cevre = 2 * PI * r;

        System.out.printf("Dairenin Alanı  : %.2f%n", alan);
        System.out.printf("Dairenin Çevresi: %.2f%n", cevre);

        System.out.print("Merkez açısını girin (α): ");
        double alfa = scanner.nextDouble();

        double dilimAlani = (PI * (r * r) * alfa) / 360;
        System.out.printf("Daire Diliminin Alanı: %.2f%n", dilimAlani);

        scanner.close();
    }
}