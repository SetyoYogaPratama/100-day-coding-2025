public class day10 {
    
    public static void main(String[] args) {
        
        // Membuat konstanta dengan keyword 'final'
        final String NAMA = "Setyo Yoga Pratama"; 
        final double PI = 3.14;

        // Menampilkan nilai konstanta
        System.out.println("Nama: " + NAMA);
        System.out.println("Nilai PI: " + PI);

        // Jika kita mencoba mengubah nilai konstanta, akan ERROR
        // Contoh (jangan diaktifkan):
        // NAMA = "Orang Lain"; // ❌ Tidak bisa, karena 'final'

    }
    
}
