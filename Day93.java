import java.util.Scanner;

public class VNormal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta jumlah baris dari pengguna
        System.out.print("Masukkan jumlah baris: ");
        int rows = scanner.nextInt();

        // Loop untuk mencetak pola
        for (int i = 0; i < rows; i++) {
            // Cetak spasi di awal
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Cetak bintang di bagian kiri
            System.out.print("*");

            // Cetak spasi di tengah
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print(" ");
            }

            // Cetak bintang di bagian kanan (kecuali pada baris pertama)
            if (i != 0) {
                System.out.print("*");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
