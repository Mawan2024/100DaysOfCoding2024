//Pola Segitiga Siku-Siku

public class SegitigaSikuSiku {
    public static void main(String[] args) {
        int tinggi = 5; // Tinggi segitiga

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



//Pola Segitiga Sama Kaki

public class SegitigaSamaKaki {
    public static void main(String[] args) {
        int tinggi = 5; // Tinggi segitiga

        for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
