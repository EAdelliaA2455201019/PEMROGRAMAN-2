/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author adellia
 */
public abstract class TRANSAKSI {

    protected int id;
    protected String keterangan;
    protected double jumlah;

    public TRANSAKSI(int id, String keterangan, double jumlah) {
        this.id = id;
        this.keterangan = keterangan;
        this.jumlah = jumlah;
    }

    public int getId() {
        return id;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public double getJumlah() {
        return jumlah;
    }

    // METHOD UNTUK POLIMORFISME
    public abstract String getJenis();
    
    public abstract double hitung();
}


