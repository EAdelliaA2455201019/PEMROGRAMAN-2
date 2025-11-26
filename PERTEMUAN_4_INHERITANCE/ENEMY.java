/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_4_INHERITANCE;

/**
 *
 * @author adellia
 */

// Kelas ENEMY adalah kelas dasar (superclass) yang mendefinisikan atribut dan method umum .
// dimiliki oleh semua musuh (enemy). Semua jenis musuh akan mewarisi kelas ini.
public class ENEMY {
    String name;        
    int hp;             
    int attackPoint;    

    // Konstruktor untuk menginisialisasi atribut musuh.
    public ENEMY(String name, int hp, int attackPoint) {
        this.name = name;
        this.hp = hp;
        this.attackPoint = attackPoint;
    }

    // Method untuk melakukan serangan, dapat diubah di kelas turunan.
    public void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPoint);
    }

    // Method untuk berjalan, dapat diubah di kelas turunan.
    public void walk() {
        System.out.println(name + " berjalan.");
    }
}
