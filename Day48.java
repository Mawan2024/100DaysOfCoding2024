import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("masukan nilai");
		int nilai = input .nextInt();
		if (nilai >0){
		System.out.print("nilai lebih besar dari 0 :");
	}else {
	System.out.print("nilai lebih kecil dari 20:");
	}
}
}
