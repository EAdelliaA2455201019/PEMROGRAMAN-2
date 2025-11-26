/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN_4_INHERITANCE;

/**
 *
 * @author adellia
 */

// Kelas utama untuk menjalankan program
public class MAIN {
    public static void main(String[] args) {
        // Membuat objek zombie dengan nama, hp, dan kekuatan serang.
        // Objek adalah instance nyata dari kelas.
        // misalnya "ZOMBIE zombie = new ZOMBIE(...)" adalah objek dari kelas ZOMBIE dengan nilai atribut tertentu.
        ZOMBIE zombie = new ZOMBIE("MELIODAS", 1000, 1945);
        
        // Membuat objek pocong dengan nama dan hp, attackPoint otomatis nol.
        POCONG pocong = new POCONG("ELI", 80);
        
        // Membuat objek burung dengan nama, hp, dan kekuatan serang.
        BURUNG burung = new BURUNG("LIEBE", 999, 888);

        // Memanggil method berjalan dan menyerang untuk masing-masing objek.
        zombie.walk();
        zombie.attack();

        pocong.walk();
        pocong.jump();
        pocong.attack();

        burung.walk();
        burung.jump();
        burung.fly();
        burung.attack();
    }
}

   
