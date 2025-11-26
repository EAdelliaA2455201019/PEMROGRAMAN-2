/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_4_INHERITANCE;

/**
 *
 * @author adellia
 */

// Kelas ZOMBIE merupakan turunan (subclass) dari kelas ENEMY.
// Keyword "extends" digunakan untuk membuat kelas turunan yang mewarisi kelas induk.
public class ZOMBIE extends ENEMY {

    // Konstruktor ZOMBIE memanggil konstruktor kelas induk.
    // Konstruktor di subclass biasanya memanggil konstruktor di superclass menggunakan "super()" untuk menginisialisasi atribut yang diwariskan.
    public ZOMBIE(String name, int hp, int attackPoint) {
        super(name, hp, attackPoint);
    }

    // Method dengan anotasi @Override berarti method tersebut menggantikan (menimpa) method yang ada di kelas induk. 
    @Override
    public void walk() {
        System.out.println(name + " berjalan lambat seperti zombie.");
    }

    // Method ini menggantikan method attack() dari kelas ENEMY.
    @Override
    // @Override digunakan untuk menandai bahwa method ini menggantikan method dengan nama yang sama di kelas induk (superclass). 
    // Ini memastikan method tersebut benar-benar ada di superclass.
    // dan membantu menghindari kesalahan penulisan nama method atau parameter.

    public void attack() {
        System.out.println(name + " menyerang dengan cakar tajam.");
    }
}
