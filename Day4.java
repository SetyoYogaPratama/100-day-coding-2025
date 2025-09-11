public class day_4 {
    
    public static void main(String[] args) {
        // \n -> pindah ke baris baru
        System.out.println("Halo!\nPerkenalkan identitas saya:");

        // \t -> bikin jarak/tab
        System.out.println("Nama\t: Setyo Yoga Pratama");
        System.out.println("Prodi\t: Informatika");
        System.out.println("Kampus\t: UNSULBAR");

        // \" dan \' -> nampilin tanda kutip
        System.out.println("Kata dosen: \"Belajar itu jangan setengah hati.\"");
        System.out.println("Tulisan: \'Mahasiswa Informatika UNSULBAR\'");

        // \\ -> nampilin backslash
        System.out.println("Folder tugas: C:\\Users\\Setyo\\Documents");

        // \r -> balik ke awal baris, teks sebelumnya bisa ketimpa
        System.out.println("Belajar Java\rMantap!"); // output: "Mantap! Java"

        // \b -> hapus satu karakter sebelumnya
        System.out.println("Helloo\b World"); // output: "Hello World"
    }
    
}
