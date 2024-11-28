package day88.java;

  import java.util.Scanner;
public class Day88Java {

   
    public static void main(String[] args) {
      


        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Jabatan (Manager/Supervisor/Staf): ");
        String jabatan = input.nextLine();
        System.out.print("Lama Kerja (tahun): ");
        int lamaKerja = input.nextInt();
        System.out.print("Jumlah Anak: ");
        int jumlahAnak = input.nextInt();

        int gajiPokok = jabatan.equalsIgnoreCase("Manager") ? 10000000 :
                        jabatan.equalsIgnoreCase("Supervisor") ? 7000000 :
                        jabatan.equalsIgnoreCase("Staf") ? 5000000 : 0;

        int bonus = lamaKerja >= 5 ? gajiPokok * 20 / 100 : (lamaKerja >= 2 ? gajiPokok * 10 / 100 : 0);
        int tunjanganAnak = jumlahAnak > 2 ? (jumlahAnak - 2) * 500000 : 0;
        int totalGaji = gajiPokok + bonus + tunjanganAnak;

        System.out.println("\nNama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Bonus: Rp" + bonus);
        System.out.println("Tunjangan Anak: Rp" + tunjanganAnak);
        System.out.println("Total Gaji: Rp" + totalGaji);
    }
}
