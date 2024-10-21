package day50.java;

import java.util.Scanner;


public class Day50Java {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MASUKAN NILAI");
        int nilai = input.nextInt();
        if (nilai>4){
            System.out.println("nilai lebih besar dari 4");
          
        }  else if(nilai>2){
            System.out.println("nilai lebih besar   dari 2");
            
        }else{
            System.out.println("nilai lebih kecil dari 2");
        }
    }
    
}
