import java.util.Scanner;
public class day12 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input Biodata Mahasiswa
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Program Studi: ");
        String prodi = input.nextLine();

        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();

        // Output Biodata
        System.out.println("\n==============================");
        System.out.println("        BIODATA MAHASISWA     ");
        System.out.println("==============================");
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Prodi  : " + prodi);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("==============================");
    }
    
          }
