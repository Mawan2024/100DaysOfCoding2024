public class PolaVTerbalik {
    public static void main(String[] args) {
        int n = 7; // Tinggi pola

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                // Cek posisi untuk membentuk "V" terbalik
                if (j == i || j == 2 * n - 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
