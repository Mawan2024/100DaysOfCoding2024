import java.util.Scanner;
public class day90 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai dari siswa
        System.out.print("Masukkan nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();

        // Menghitung nilai akhir berdasarkan bobot
        double nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.35) + (nilaiUAS * 0.35);
        String status;
        double kekurangan = 0;

        if (nilaiAkhir >= 75) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
            kekurangan = 75 - nilaiAkhir;
        
        }System.out.printf("\nNilai Akhir: %.2f\n", nilaiAkhir);
        System.out.println("Status: " + status);

        if (status.equals("Tidak Lulus")) {
            System.out.printf("Kekurangan nilai: %.2f\n", kekurangan);
        }

        
    }
}
