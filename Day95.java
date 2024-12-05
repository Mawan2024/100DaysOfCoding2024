import java.util.Scanner;

public class PolaSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah baris
        System.out.print("Masukkan jumlah baris: ");
        int n = scanner.nextInt();

        // Segitiga siku-siku
        System.out.println("\nSegitiga Siku-Siku:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Segitiga siku-siku terbalik
        System.out.println("\nSegitiga Siku-Siku Terbalik:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
