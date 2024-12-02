import java.util.Scanner;

public class day92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i < a- 1) {
                for (int j = 0; j < 2 * (a - i - 1) - 1; j++) {
                    System.out.print(" ");
                }
               
                System.out.print("*");
            }
            System.out.println();
        }

      
    }
}
