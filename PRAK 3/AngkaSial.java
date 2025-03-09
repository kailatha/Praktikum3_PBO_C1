/*
 * File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
 * Nama : Kaila Talitha Putri 
 * Nim : 24060123140179
 * Lab : C1
 */

public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukan angka!!!");
        }
    }
}
// Tidak, baris 12 tidak akan dieksekusi jika angka yang dimasukkan adalah 13.
// Karena eksepsi dilempar sebelum mencapai baris ini, sehingga program langsung keluar dari metode cobaAngka().
// iya, baris 21 akan dieksekusi karena terjadi eksepsi dan terdapat pada blok catch.
// Solusi menggunakan try-catch terpisah untuk setiap angka agar eksepsi tidak menghentikan eksekusi angka berikutnya.