import java.util.Scanner;

public class MainPerpustakaan {
    public static void main (String[] args){

        Perpustakaan buku = new Perpustaka();
        Peminjam mahasiswa = new Peminjam(buku);

        mahasiswa.masuk();



        Scanner input = new Scanner(System.in);
        String pilih ;

        while (true){
            System.out.println("===== Menu Program =====");
            System.out.println("==== Silahkan pilih ====");
            System.out.println("[1] login ");
            System.out.println("[2] Pemninjaman BUku");
            System.out.println("[3] Pengembalian Buku");
            System.out.println("[4] Logout");
            System.out.println("[0] Exit");

            pilih= input.nextLine();

            if (pilih.equalsIgnoreCase("1")){
                mahasiswa.masuk();
            }else if (pilih.equalsIgnoreCase("2")){
                mahasiswa.meminjam();
            }else if (pilih.equalsIgnoreCase("3")){
                mahasiswa.mengembalikan();
            }else if (pilih.equalsIgnoreCase("4")){
                mahasiswa.keluar();
            }else if(pilih.equalsIgnoreCase("0")){
                System.exit(0);
            }else {
                System.out.println("Anda Memasukan Perintah yang salah");
            }

        }

    }
}
