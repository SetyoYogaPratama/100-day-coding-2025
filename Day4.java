public class day_4 {
    
    public static void main(String[] args) {
        // Menampilkan identitas menggunakan escape sequence

        System.out.println("=== Identitas Diri ===");

        // \n digunakan untuk pindah ke baris baru
        System.out.println("Nama    : Setyo Yoga Pratama\nProdi   : Informatika\nKampus  : UNSULBAR");

        // \t digunakan untuk memberi jarak/tab agar rapi
        System.out.println("\n--- Format dengan Tab ---");
        System.out.println("Nama\t: Setyo Yoga Pratama");
        System.out.println("Prodi\t: Informatika");
        System.out.println("Kampus\t: UNSULBAR");

        // Gabungan \n dan \t untuk format tabel sederhana
        System.out.println("\n--- Format Tabel ---");
        System.out.println("\tNama\t: Setyo Yoga Pratama\n\tProdi\t: Informatika\n\tKampus\t: UNSULBAR");
    }
    
}
