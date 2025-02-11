import java.util.Scanner;

public class loopping {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        int input;
        do {
            System.out.print("Masukkan angka positif: ");
            input = masukan.nextInt();
        } while (input >= 0);

        System.out.println("Program selesai, Anda memasukkan angka negatif.");
        masukan.close();
    }
}