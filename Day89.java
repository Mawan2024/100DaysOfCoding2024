import java.util.Scanner;

public class HitungVokal {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input kalimat dari pengguna
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();

        // Memisahkan setiap huruf menjadi karakter dan menyimpannya dalam array
        char[] karakter = kalimat.toCharArray();

        // Menghitung jumlah huruf vokal
        int jumlahVokal = 0;
        for (char huruf : karakter) {
            if (isVokal(huruf)) {
                jumlahVokal++;
            }
        }

        // Menampilkan hasil
        System.out.println("\nKarakter: " + java.util.Arrays.toString(karakter));
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);
    }

    // Fungsi untuk memeriksa apakah karakter adalah huruf vokal
    private static boolean isVokal(char huruf) {
        huruf = Character.toLowerCase(huruf); // Ubah menjadi huruf kecil
        return huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' || huruf == 'o';
    }
}
