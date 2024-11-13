package DAY73;

public class DAY73 { 
    public static void main(String[] args) {
        String nama = "mawan";
        char karakter1 = nama.charAt(0);
        char karakter2 = nama.charAt(3);
        System.out.println("karakter di indeks 0: "+karakter1);
        System.out.println(" karakter di indeks 3 :"+karakter2);
        System.out.println("seluru karakter dalam string");
        for(int i = 0; i<nama.length();i++){
            System.out.println("karakter di indeks "+i+";"+nama.charAt(i));
        }
    }
}
