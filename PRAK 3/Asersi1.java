/*
 * File : Asersi1.java
 * Nama : Kaila Talitha Putri 
 * Nim : 24060123140179
 * Lab : C1
 */

public class Asersi1{
    public static void main(String[] args){
        int x = 0;
        if (x > 0){
            System.out.println("x bilangan positif");
        }else{
            assert(x < 0): "ada kesalahan code";
            System.out.println("x bilangan negatif");
        }
    }
}