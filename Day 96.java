import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah baris untuk setengah pola
        System.out.print("Masukkan jumlah baris untuk setengah pola: ");
        int rows = scanner.nextInt();

        // Bagian atas pola diamond
        for (int i = 1; i <= rows; i++) {
            // Cetak spasi
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bagian bawah pola diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Cetak spasi
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
