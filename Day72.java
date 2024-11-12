public class faktorial {
    public static int hitungfaktorial(int a){
        if(a==0 || a==1){
            return 1;
            
        }else{
            return a*hitungfaktorial(a-1);     
        }
        }
    public static void main(String[] args) {
        int angka = 5; 
        int hasil =hitungfaktorial(angka);
        System.out.println("faktorial dari "+angka+"adalah"+hasil);
    }
    }
