package project100dayscoding;
import java.time.LocalTime;
import java.util.Scanner;
public class Day100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = in.nextLine();
        
        LocalTime waktuSaatIni = LocalTime.now();
        String salam;
        
        if(waktuSaatIni.isBefore(LocalTime.NOON)){
            salam = "Selamat pagi";
        }else if(waktuSaatIni.isBefore(LocalTime.of(17, 0))){
            salam = "Selamat siang";
        }else{
            salam = "Selamat malam";
        }    
        System.out.println("===============================");
        System.out.println(" " + salam + ", " + nama);
        System.out.println(" "+"Program telah selesai");
        System.out.println("===============================");
    }
}
