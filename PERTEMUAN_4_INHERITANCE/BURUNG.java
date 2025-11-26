/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_4_INHERITANCE;

/**
 *
 * @author adellia
 */

// Kelas BURUNG merupakan turunan (subclass) dari kelas ENEMY
// Keyword "extends" digunakan untuk membuat kelas turunan yang mewarisi kelas induk.
public class BURUNG extends ENEMY {

    // Konstruktor BURUNG memanggil konstruktor kelas induk.
    public BURUNG(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    // Mengganti cara berjalan burung.
    @Override
    public void walk() {
        System.out.println(name + " berjalan dengan ringan.");
    }

    // Mengganti cara menyerang burung.
    @Override
    public void attack() {
        System.out.println(name + " menyerang dengan paruh tajam.");
    }

    // Method khusus untuk burung agar bisa loncat.
    public void jump() {
        System.out.println(name + " loncat-loncat.");
    }

    // Method khusus untuk burung agar bisa terbang.
    public void fly() {
        System.out.println(name + " terbang di udara.");
    }
}
