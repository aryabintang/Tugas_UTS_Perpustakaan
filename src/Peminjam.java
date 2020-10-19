

public class Peminjam {
   private Perpustakaan perpustakaan;



   public  Peminjam (Perpustakaan perpustakaan){
       this.perpustakaan=perpustakaan;
   }

   void masuk(){
       this.perpustakaan.login();
   }
   void meminjam(){
       this.perpustakaan.pinjam();
   }
   void mengembalikan (){
       this.perpustakaan.pengembalian();
   }
   void keluar (){
       this.perpustakaan.logout();
   }


}
