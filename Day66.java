package day66.java;


public class Day66Java {

    
    public static void main(String[] args) {
      // polah persegih 
     int ukuran = 5;
     for(int a = 0; a<=ukuran; a++){
         for(int b = 0; b<=ukuran; b++){
             System.out.print("*");         System.out.println("");
    }
      // pola persegi panjang 
      int panjang = 5;
      int lebar =10;
      for(int c= 0; c<=panjang; c++){
          for(int d= 0; d<=lebar; d++){
              System.out.print("*");
          }
          System.out.println();
      }
    }
}
