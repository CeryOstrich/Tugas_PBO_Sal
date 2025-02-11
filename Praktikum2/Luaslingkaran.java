
//file : luaslingkaran.java
import java.util.Scanner;

public class Luaslingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;

        // Input jari-jari
        System.out.print("Masukkan Jari-jari: ");
        double radius = scanner.nextDouble();

        // Menghitung luas lingkaran
        double luas = radius * radius * PI;

        // Menampilkan hasil
        System.out.println("Luas lingkaran: " + luas);

        // Menutup scanner
        scanner.close();
    }
}
