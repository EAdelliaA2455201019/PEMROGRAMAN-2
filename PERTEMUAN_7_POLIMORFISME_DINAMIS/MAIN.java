/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_7_POLIMORFISME_DINAMIS;

/**
 *
 * @author adellia
 */
public class MAIN {
    public static void main(String[] args) {
        
        // Membuat objek bangun datar.
        BANGUN_DATAR bangunD = new BANGUN_DATAR();
        PERSEGI persegi = new PERSEGI (5);
        SEGITIGA segitiga = new SEGITIGA (5, 10);
        LINGKARAN lingkaran = new LINGKARAN (10);
        
        // panggil method luas dan keliling
        bangunD.luas();
        bangunD.keliling();
        
        System.out.println("Luas Persegi : " + persegi.luas());
        System.out.println("Keliling Persegi : " + persegi.keliling());
        System.out.println("Luas Segitiga " + segitiga.luas());
        System.out.println("Keliling Segitiga : " + segitiga.keliling());
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
    }
}
