import java.util.Scanner;

public class jamang1 {
    public static void main(String[] args) {
        Scanner patamai = new Scanner(System.in); // membuat scanner baru bernama pattamai
        int choice;

        do {
            System.out.println("apa mau Mu hitung anak muda?");
            System.out.println("1.persegi panjang");
            System.out.println("2.persegi");
            System.out.println("3.segitiga");
            System.out.println("4.jajar genjang");
            System.out.println("5.trapesium");
            System.out.println("6.layang-layang");
            System.out.println("7.belah ketupat");
            System.out.println("8.lingkaran");
            System.out.println("9. passuni deh");

            System.out.println("Masukkan pilahnMu Kanda: ");
            choice = patamai.nextInt(); // Untuk Menerima Inputan User

            switch (choice) { // Mengarahkan user ke case sesuai dengan inputan sebelumnya
                case 1:
                    System.out.println("---Mencari Luas Dan keliling Persegi Panjang---");
                    System.out.println("Masukkan Panjangn: ");
                    double panjang = patamai.nextDouble(); // meminta inputan kepada user,
                    System.out.println("Masukkan Lebar: "); // mendeklarasikan Inputan user sebagai tipe data Double/int
                    double lebar = patamai.nextDouble();
                    System.out.println("Luas" + (panjang * lebar)); // menampilkan operasi aritmatika
                    System.out.println("Keliling" + (2 * (panjang * lebar)));
                    break; // sebagai batas eksekusi case
                case 2:
                    System.out.println("---Mencari Luas Dan keliling Persegi---");
                    System.out.println("Masukkan Panjang sisi: ");
                    double sisi = patamai.nextDouble();
                    System.out.println("Luas : " + (sisi * sisi));
                    System.out.println("Keliling" + (4 * sisi));
                    break;
                case 3:
                    System.out.println("---Mencari Luas Dan keliling Segitiga---");
                    System.out.println("Masukkan alas: ");
                    double alas = patamai.nextDouble();
                    System.out.println("Masukkan tinggi: ");
                    double tinggi = patamai.nextDouble();
                    System.out.println("Masukkan sisi miring: ");
                    double sisimiring = patamai.nextDouble();
                    System.out.println("Luas: " + (alas * tinggi * sisimiring));
                    System.out.println("Keliling: " + (0.5 * alas * tinggi));
                    break;
                case 4:
                    System.out.println("---Mencari Luas Dan keliling Jajar Genjang---");
                    System.out.println("Masukkan alas: ");
                    double alasG = patamai.nextDouble();
                    System.out.println("Masukkan tinggi: ");
                    double tinggiG = patamai.nextDouble();
                    System.out.println("Masukkan Panjang Sisi Lain: ");
                    double Psisi = patamai.nextDouble();
                    System.out.println("Luas: " + (alasG * tinggiG));
                    System.out.println("Keliling: " + (2 * (alasG * Psisi)));
                    break;
                case 5:
                    System.out.println("---Mencari Luas Dan keliling Trapesium---");
                    System.out.println("Masukkan panjang sisi sejajar: ");
                    double pss = patamai.nextDouble();
                    System.out.println("Masukkan Panjang sisi sejajar kedua: ");
                    double pss2 = patamai.nextDouble();
                    System.err.println("Masukkan Tinggi Trapesium: ");
                    double tinggiT = patamai.nextDouble();
                    System.out.println("Masukkan panjang sisi miring Trapesium: ");
                    double smt = patamai.nextDouble();
                    System.out.println("Masukkan Panjang sisi keempat: ");
                    double psk = patamai.nextDouble();
                    System.out.println("Luas: " + (0.5 * (pss * pss2 * tinggiT)));
                    System.out.println("Keliling: " + (pss + pss2 + smt + psk));
                    break;
                case 6:
                    System.out.println("---Mencari Luas Dan keliling Layang-Layang---");
                    System.out.println("Masukan Diagonal 1: ");
                    double d1 = patamai.nextDouble();
                    System.out.println("Masukkan Diagonal 2:");
                    double d2 = patamai.nextDouble();
                    System.out.println("Masukkan sisi Pendek Layang-Layang: ");
                    double a = patamai.nextDouble();
                    System.out.println("Masukkan sisi Panjang Layang-Layang: ");
                    double b = patamai.nextDouble();
                    System.out.println("Luas: " + (0.5 * (d1 * d2)));
                    System.out.println("Keliling: " + (2 * (a + b)));
                    break;
                case 7:
                    System.out.println("---Mencari Luas Dan keliling Belah Ketupat---");
                    System.out.println("Masukkan Diagonal ! Belah Ketupat: ");
                    double kd1 = patamai.nextDouble();
                    System.out.println("Masukkan Diagonal 2 Belah Ketupat: ");
                    double kd2 = patamai.nextDouble();
                    System.out.println("Masukkan Panjang sisi Belah Ketupat: ");
                    double ksisi = patamai.nextDouble();
                    System.out.println("Luas: " + (0.5 * (kd1 * kd2)) + (0.5 * (kd1 * kd2)));
                    System.out.println("Keliling: " + (4 * ksisi));
                    break;
                case 8:
                    System.out.println("---Mencari Luas Dan keliling Lingkaran---");
                    final double pi = 3.14159;
                    System.out.println("Masukkan Jari Jari Lingkaran: ");
                    double jj = patamai.nextDouble();
                    System.out.println("Luas: " + (pi * jj * jj));
                    System.out.println("Keliling: " + (2 * pi * jj));
                    break;
            }
        } while (choice != 9); // akhir dari logika do dimana memvalidasi jika user menginputkan 9
                               // maka program akan otomatis keluar
        {
            System.out.println("Passuni deh");
        }
        patamai.close(); // untuk menutup atau mematikan scenner
    }

}