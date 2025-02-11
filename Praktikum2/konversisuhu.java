import java.util.Scanner; // Impor Scanner untuk membaca input pengguna

public class konversisuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat Scanner

        System.out.println("Masukkan nilai Fahrenheit: ");
        double f = scanner.nextDouble(); // Membaca input sebagai double

        // Mengonversi Fahrenheit ke Celcius
        double c = (5.0 / 9) * (f - 32);

        // Menampilkan hasil konversi
        System.out.println(f + " Fahrenheit setara dengan " + c + " Celcius.");

        scanner.close(); // Menutup Scanner
    }
}
