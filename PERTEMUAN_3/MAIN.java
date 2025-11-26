/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN_3;

/**
 *
 * @author adellia
 */
public class MAIN {
    
    public static void main(String[] args) {
        // Membuat 3 objek mahasiswa dengan data awal
        MAHASISWA mhs1 = new MAHASISWA("2455201001", "Dandy", 3.5);
        MAHASISWA mhs2 = new MAHASISWA("2455201002", "Husnal", 3.8);
        MAHASISWA mhs3 = new MAHASISWA("2455201003", "Labib", 2.9);

        // Tampilkan data awal setiap mahasiswa
        mhs1.tampilData();
        mhs2.tampilData();
        mhs3.tampilData();

        // Update IPK masing-masing mahasiswa
        mhs1.updateIPK(3.85);
        mhs2.updateIPK(3.4);
        mhs3.updateIPK(3.1);

        // Set status SPP dan ambil SKS untuk tiap mahasiswa
        mhs1.setSPPStatus(true);
        mhs1.ambilSKS(20);

        mhs2.setSPPStatus(false);
        mhs2.ambilSKS(19);

        mhs3.setSPPStatus(true);
        mhs3.ambilSKS(18);

        System.out.println("\nSetelah Update Data:\n");

        // Tampilkan data setelah update
        mhs1.tampilData();
        System.out.println();
        mhs2.tampilData();
        System.out.println();
        mhs3.tampilData();
    }
}

