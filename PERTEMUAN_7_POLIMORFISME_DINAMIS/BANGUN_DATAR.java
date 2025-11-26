/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN_7_POLIMORFISME_DINAMIS;

/**
 *
 * @author adellia
 */
// POLIMORFISME STATIS: hanya terjadi dalam satu class saja.
// POLIMORFISME DINAMIIS: terjadi pada saat ada hubungan dengan class lain seperti inheritance.
// memiliki isi method beda, walaupun namanya sama.
public class BANGUN_DATAR {
    
    // berupa function, ada return.
    float luas(){
        System.out.println("Menghitung Luas Keliling");
        return 0;
    }
    
    float keliling (){
        System.out.println("Menghitung Keliling Bangun Datar");
        return 0;
    }
}
// Setiap class memiliki method yang sama, yaitu luas dan keliling.
// Tetapi rumusnya berbeda.
