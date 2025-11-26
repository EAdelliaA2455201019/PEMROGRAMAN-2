/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN_4_MODIFIER;

import PERTEMUAN_3.*;
/**
 *
 * @author adellia
 */

 class MAIN {
    
    public static void main(String[] args) {
        // Membuat 3 objek mahasiswa dengan data awal
        MAHASISWA_MODIFIER m1 = new MAHASISWA_MODIFIER("2455201001", "Dandy", 3.5);
        MAHASISWA_MODIFIER m2 = new MAHASISWA_MODIFIER("2455201002", "Husnal", 3.8);
        MAHASISWA_MODIFIER m3 = new MAHASISWA_MODIFIER("2455201003", "Labib", 2.9);
        
        m1.tampilData();
        m1.updateIPK(3.85);
        m1.setSPPStatus(true);
        m1.ambilSKS(0);
        System.out.println("================================");
        m2.tampilData();
        m2.updateIPK(3.4);
        m2.setSPPStatus(true);
        m2.ambilSKS(0);
        System.out.println("================================");
        m3.tampilData();
        m3.updateIPK(3.1);
        m3.setSPPStatus(true);
        m3.ambilSKS(0);
        System.out.println("================================");
        System.out.println("\nBIODATA MAHASISWA SETELAH UPDATE!\n");

        // Tampilkan data setelah update
        m1.tampilData();
        System.out.println();
        m2.tampilData();
        System.out.println();
        m3.tampilData();
    }
}

