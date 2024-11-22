import java.lang.Math;
public class day82 {
    public static void main(String[] args) {
       


       
        double angka = 7.65;

        // Menggunakan Math.ceil() - membulatkan ke atas
        double hasilCeil = Math.ceil(angka);
        System.out.println("Math.ceil(" + angka + ") = " + hasilCeil);

        // Menggunakan Math.floor() - membulatkan ke bawah
        double hasilFloor = Math.floor(angka);
        System.out.println("Math.floor(" + angka + ") = " + hasilFloor);

        // Menggunakan Math.round() - membulatkan ke angka terdekat
        long hasilRound = Math.round(angka);
        System.out.println("Math.round(" + angka + ") = " + hasilRound);

    }
           
   }
