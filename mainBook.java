import java.util.Scanner;

public class mainBook {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Book book = new Book();

        Scanner input = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI PERPUSAT");
        System.out.println("Silakan pilih kategori buku yang ingin dibaca:");
        System.out.println("1. Teknologi");
        System.out.println("2. Sejarah");
        System.out.println("3. Filsafat");
        System.out.println("4. Psikologi");
        System.out.println("5. FIksi");
        System.out.print("Masukkan pilihanmu : ");
        int kategori = input.nextInt();
        System.out.println("=======================================================");
        System.out.println();

        switch(kategori) {
            case 1:
            System.out.println("Berikut kami tampilkan buku-buku tentang teknologi.");
            book.teknologi();
            break;

            case 2:
            System.out.println("Berikut kami tampilkan buku-buku tentang sejarah.");
            book.sejarah();
            break;

            case 3:
            System.out.println("Berikut kami tampilkan buku-buku tentang filsafat.");
            book.filsafat();
            break;

            case 4:
            System.out.println("Berikut kami tampilkan buku-buku tentang psikologi.");
            book.psikologi();
            break;

            case 5:
            System.out.println("Berikut kami tampilkan buku-buku tentang fiksi.");
            book.fiksi();
            break;

            default:
            System.out.println("Pilihan anda tidak sesuai kategori.");
        }
    }
}
