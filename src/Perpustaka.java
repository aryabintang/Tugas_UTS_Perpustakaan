import java.util.Scanner;
public class Perpustaka implements Perpustakaan {
    private String nim;
    private String nama;
    private boolean loginon;
    private  String nama_buku;
    Scanner input = new Scanner(System.in);


    @Override
    public void login() {
        loginon = true;
        System.out.println("Selamat Datang di Program Perpustakaan");
        System.out.println("Silahkan login Terlebih Dahulu !!!");
        System.out.println("");
        System.out.print("Silahkan Masukan Nama =");
        nama = input.nextLine();
        System.out.print("Masukan Nim anda =");
        nim = input.nextLine();
        System.out.println(" Anda sudah Login!!!");

    }

    @Override
    public void pinjam() {
        if (loginon) {

            String pilih;
            System.out.println("============ Daftar Buku ============");
            System.out.println("========= YANG DAPAT DI PINJAM ======");
            System.out.println("1. Buku 24 Jam Bisa Pemrograman");
            System.out.println("2. Buku Pintar Membuat Aplikasi");
            System.out.println("3. Buku Cepat Menguasi Bahasa.onggris");
            System.out.println("4. Buku Belajar Database");
            System.out.println("5. Buku Belajar Binsis");

            pilih = input.nextLine();

            if (pilih.equalsIgnoreCase("1")) {
                System.out.print("Atas Nama =");
                System.out.println(nama);
                System.out.print("Dengan Nim =");
                System.out.println(nim);
                System.out.println(" Anda meminjam BUku 24 Jam Bisa Pemrograman");
            } else if (pilih.equalsIgnoreCase("2")) {
                System.out.print("Atas Nama =");
                System.out.println(nama);
                System.out.print("Dengan Nim =");
                System.out.println(nim);
                System.out.println("Anda Meminjam Buku Pintar Membuat Aplikasi");
            } else if (pilih.equalsIgnoreCase("3")) {
                System.out.print("Atas Nama =");
                System.out.println(nama);
                System.out.print("Dengan Nim =");
                System.out.println(nim);
                System.out.println("Anda Meminjam Buku Cepat Menguasi Bahasa.onggris ");
            }else if (pilih.equalsIgnoreCase("4")){
                System.out.print("Atas Nama =");
                System.out.println(nama);
                System.out.print("Dengan Nim =");
                System.out.println(nim);
                System.out.println("Anda Meminjam Buku Belajar Database");
            }else if (pilih.equalsIgnoreCase("5")){
                System.out.print("Atas Nama =");
                System.out.println(nama);
                System.out.print("Dengan Nim =");
                System.out.println(nim);
                System.out.println("Anda Meminjam Buku Belajar Bisnis ");
            }
        }else{
        System.out.println("Anda harus Login terlebih dahulu!");
        }
    }




    @Override
    public void pengembalian () {
        if (loginon) {

            System.out.println("Anda ingin mengembalikan Buku?");
            System.out.println("Y/T");
            String pilih;
            pilih = input.nextLine();
            String buku;

            if (pilih.equalsIgnoreCase("Y")) {
                System.out.println(nama);
                System.out.println(nim);


                System.out.println("1. Buku 24 Jam Bisa Pemrograman");
                System.out.println("2. Buku Pintar Membuat Aplikasi");
                System.out.println("3. Buku Cepat Menguasi Bahasa.onggris");
                System.out.println("4. Buku Belajar Database");
                System.out.println("5. Buku Belajar Binsis");
                System.out.print("Pilih Buku yang akan di kembalikan = ");

                buku = input.nextLine();


                if (buku.equalsIgnoreCase("1")) {
                    System.out.print("Atas Nama  =");
                    System.out.println(nama);
                    System.out.print("Dengan Nim =");
                    System.out.println(nim);
                    System.out.println("1. Buku 24 Jam Bisa Pemrograman");
                    System.out.println("Sudah anda kembalikan ");
                } else if (buku.equalsIgnoreCase("2")) {
                    System.out.print("Atas Nama  =");
                    System.out.println(nama);
                    System.out.print("Dengan Nim =");
                    System.out.println(nim);
                    System.out.println("2. Buku Pintar Membuat Aplikasi");
                    System.out.println("Sudah anda kembalikan ");
                } else if (buku.equalsIgnoreCase("3")) {
                    System.out.print("Atas Nama  =");
                    System.out.println(nama);
                    System.out.print("Dengan Nim =");
                    System.out.println(nim);
                    System.out.println("3. Buku Cepat Menguasi Bahasa.onggris");
                    System.out.println("Sudah anda kembalikan ");
                } else if (buku.equalsIgnoreCase("4")) {
                    System.out.print("Atas Nama  =");
                    System.out.println(nama);
                    System.out.print("Dengan Nim =");
                    System.out.println(nim);
                    System.out.println("4. Buku Database");
                    System.out.println("Sudah anda kembalikan ");
                } else if (buku.equalsIgnoreCase("5")) {
                    System.out.print("Atas Nama  =");
                    System.out.println(nama);
                    System.out.print("Dengan Nim =");
                    System.out.println(nim);
                    System.out.println("5. Buku Belajar Bisnis");
                    System.out.println("Sudah anda kembalikan ");
                }

            } else if (pilih.equalsIgnoreCase("y")) {
                System.out.println("Buku yang anda Pinjam ?");
                System.out.println("1. Buku 24 Jam Bisa Pemrograman");
                System.out.println("2. Buku Pintar Membuat Aplikasi");
                System.out.println("3. Buku Cepat Menguasi Bahasa.onggris");
                System.out.println("4. Buku Belajar Database");
                System.out.println("5. Buku Belajar Binsis");
                System.out.print("Pilih Buku yang akan di kembalikan = ");
                buku = input.nextLine();


                if (buku.equalsIgnoreCase("1")) {
                    System.out.print("Atas Nama  =");
                    System.out.println(nama);
                    System.out.print("Dengan Nim =");
                    System.out.println(nim);
                    System.out.println("1. Buku 24 Jam Bisa Pemrograman");
                    System.out.println("Sudah anda kembalikan ");
                } else if (buku.equalsIgnoreCase("2")) {
                    System.out.print("Atas Nama  =");
                    System.out.println(nama);
                    System.out.print("Dengan Nim =");
                    System.out.println(nim);
                    System.out.println("2. Buku Pintar Membuat Aplikasi");
                    System.out.println("Sudah anda kembalikan ");
                } else if (buku.equalsIgnoreCase("3")) {
                    System.out.print("Atas Nama  =");
                    System.out.println(nama);
                    System.out.print("Dengan Nim =");
                    System.out.println(nim);
                    System.out.println("3. Buku Cepat Menguasi Bahasa.onggris");
                    System.out.println("Sudah anda kembalikan ");
                } else if (buku.equalsIgnoreCase("4")) {
                    System.out.print("Atas Nama  =");
                    System.out.println(nama);
                    System.out.print("Dengan Nim =");
                    System.out.println(nim);
                    System.out.println("4. Buku Database");
                    System.out.println("Sudah anda kembalikan ");
                } else if (buku.equalsIgnoreCase("5")) {
                    System.out.print("Atas Nama  =");
                    System.out.println(nama);
                    System.out.print("Dengan Nim =");
                    System.out.println(nim);
                    System.out.println("5. Buku Belajar Bisnis");
                    System.out.println("Sudah anda kembalikan ");
                }

            } else if (pilih.equalsIgnoreCase("T")) {
                System.out.println("Jangan lupa sebelum logout harus mengembalikan Buku yang di pinjam.");
            } else if (pilih.equalsIgnoreCase("t")) {
                System.out.println("Jangan lupa sebelum logout harus mengembalikan Buku yang di pinjam");
            }
        }else{
            System.out.println("Anda harus Login terlebih dahulu!");
        }
    }

    @Override
    public  void logout (){
        loginon=false;
        System.out.println("Terimakasih Telah Menggunakan Program ini ");
        System.out.println("Jangan Lupa Untuk KEmbali lagi yah...");
    }
}
