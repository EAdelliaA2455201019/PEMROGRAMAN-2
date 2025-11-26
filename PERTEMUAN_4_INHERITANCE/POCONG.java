/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_4_INHERITANCE;

/**
 *
 * @author adellia
 */

// Kelas POCONG merupakan turunan (subclass) dari kelas ENEMY.
// Keyword "extends" digunakan untuk membuat kelas turunan yang mewarisi kelas induk.
public class POCONG extends ENEMY {

    // Konstruktor POCONG, attackPoint diset nol karena pocong tidak menyerang dengan poin.
    public POCONG(String name, int hp) {
        super(name, hp, 0);
    }

    // Method khusus untuk loncat, hanya ada di kelas POCONG.
    public void jump() {
        System.out.println(name + " melompat-lompat.");
    }

    // Mengganti cara berjalan sesuai karakter pocong.
    @Override
    public void walk() {
        System.out.println(name + " berjalan dengan cara melompat.");
    }

    // Mengganti cara menyerang sesuai karakter pocong.
    @Override
    public void attack() {
        System.out.println(name + " menyerang dengan cara menyeramkan.");
    }
}
