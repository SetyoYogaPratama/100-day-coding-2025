import java.util.Scanner;

public class day11 {
    
    public static void main(String[] args) {
        // Membuat Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Input String
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        // Input integer
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        // Input double
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        // Menampilkan hasil input
        System.out.println("\n--- Data Diri ---");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Tinggi : " + tinggi + " cm");
    }
    
}
