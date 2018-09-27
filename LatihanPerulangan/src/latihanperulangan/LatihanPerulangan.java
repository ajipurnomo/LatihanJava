package latihanperulangan;

public class LatihanPerulangan {

    public static void main(String[] args) {
      int i;
      i=1;
      do {
          System.out.println("Angka "+ i++);
      } //end do
       while (i <= 5);      
    System.out.println("==================="); //ENTER 
    
       for (i=5; i >= 1; i--){
        System.out.println("Angka "+i);         
       } //end for
    System.out.println("==================="); //ENTER    
    
       while (i <= 5){ 
          System.out.println("angka"+ i++);
          } //end while
       
    }//public static   
} //public class
//for : batas awal dan akhirnya JELAS "saya mau mengecek 100 kaleng ini"
//while :  batasnya gak jelas, misal  "saya mau lulus kuliah saat nilai sata sudah tinggi"
//kalau while saat angka input gak sesuia kondisi, maka gak kepanggil