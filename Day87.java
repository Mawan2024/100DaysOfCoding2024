package day87;


public class Day87 {

    
    public static void main(String[] args) {
       
   
        // Membuat array satu dimensi dengan beberapa nilai
        int[] angka = {10, 20, 30, 40, 50};

        // Menampilkan nilai array sebelum perubahan
        System.out.println("Array sebelum perubahan:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Indeks " + i + ": " + angka[i]);
        }

        // Mengubah nilai pada indeks ke-2
        angka[2] = 100;

        // Menampilkan nilai array setelah perubahan
        System.out.println("\nArray setelah perubahan:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("Indeks " + i + ": " + angka[i]);
        }
    }
}
