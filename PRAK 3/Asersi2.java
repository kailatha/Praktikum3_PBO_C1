/*
 * File : Asersi2.java
 * Nama : Kaila Talitha Putri 
 * Nim : 24060123140179
 * Lab : C1
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}


public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "
            + kelilingLingkaran);
    }
}

// Asersi (Assertion) dalam Java adalah mekanisme untuk memastikan bahwa asumsi tertentu dalam program benar pada saat runtime. 
// Asersi bukan mekanisme yang tepat untuk validasi input dari pengguna.
// Asersi biasanya digunakan untuk debugging atau memeriksa kondisi yang seharusnya selalu benar dalam logika program.
// Jika ingin memastikan input selalu valid, lebih baik menggunakan pengecekan dengan if dan melempar Exception