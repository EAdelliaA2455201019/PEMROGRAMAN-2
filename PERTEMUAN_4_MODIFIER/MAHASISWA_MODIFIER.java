/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_4_MODIFIER;

import PERTEMUAN_3.*;
/**
 *
 * @author adellia
 */
class MAHASISWA_MODIFIER {
    // Atribut menyimpan data mahasiswa
    private String NIM = "";
    private String Nama = "";
    private double IPK = 0;
    private String Predikat = "";

    // Atribut tambahan (untuk prosedur setSPPStatus dan ambilSKS)
    public boolean sppLunas = false;
    int totalSKS = 0;

    // Konstruktor: Metode khusus yang otomatis dipanggil ketika objek dibuat
    public MAHASISWA_MODIFIER(String NIM, String Nama, double IPK) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.IPK = IPK;
    }

    public void tampilData() {
        Predikat();  // Panggil method Predikat supaya Predikat ter-update sebelum tampil
        System.out.println("BIODATA MAHASISWA");
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + Nama);
        System.out.println("IPK : " + IPK);
        System.out.println("Predikat : " + Predikat);
    }

    private String Predikat() {
        if (IPK >= 3.5) {
            Predikat = "Cumlaude";
        } else if (IPK >= 3.0) {
            Predikat = "Sangat Memuaskan";
        } else {
            Predikat = "Cukup";
        }
        return Predikat;
    }

  
    // Method adalah sub-program yang memiliki tujuan tertentu, berupa fungsi/prosedur yang berada dalam class
    
    // Fungsi dengan Parameter
    // Fungsi adalah sebutan untuk method yang mengembalikkan nilai
    // Parameter berfungsi sebagai input data
    // Parameter ditulis di antara tanda kurung ();
    // Parameter harus diberikan tipe data
    // Bila terdapat lebih dari satu parameter, dipisah dengan tanda koma
    public double updateIPK(double IPK) {
        this.IPK = IPK;
        return IPK;
    }

    // Prosedur dengan Parameter
    // Prosedur adalah sebutan method yang tidak mengembalikkan nilai
    // Ditandai dengan kata kunci void
    public void setSPPStatus(boolean status) {
        if (status) {
            System.out.println("SPP telah ditandai sebagai lunas.");
            sppLunas = true;
        } else {
            System.out.println("SPP ditandai belum lunas.");
            sppLunas = false;
        }
    }

    public void ambilSKS(int jumlahSKS) {
        if (jumlahSKS > 0) {
            totalSKS += jumlahSKS;
            System.out.println("Berhasil mengambil " + jumlahSKS + " SKS.");
        } else {
            System.out.println("Jumlah SKS tidak valid.");
        }
    }
}
    
 
