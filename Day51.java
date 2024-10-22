package day51.java.newpackage;

import java.util.Scanner;

public class swith_case {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("masukan warna");
    String nilai = input.nextLine();
    switch(nilai){
        case "mera":
            System.out.println("maron ");
            break;
        case "jingga":
            System.out.println("menyala");
            break;
        default:
            System.out.println("warna yang anda masukan salah");
    }
    
}
}
