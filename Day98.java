import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan nilai awal (x): ");
        int x = scanner.nextInt();
        System.out.print("Masukkan nilai akhir (y): ");
        int y = scanner.nextInt();

        int sum = 0;

        // Penjumlahan bilangan genap
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        // Menampilkan hasil
        System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + sum);

        
    }
}
