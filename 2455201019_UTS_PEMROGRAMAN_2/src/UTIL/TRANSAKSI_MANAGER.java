/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;

import MODEL.PEMASUKAN;
import MODEL.PENGELUARAN;
import MODEL.TRANSAKSI;
import java.util.ArrayList;

/**
 *
 * @author adellia
 */
public class TRANSAKSI_MANAGER {
    private int counter = 1;
    private Object lblSaldo;
    private Object manager;
    public int generateId() {
    return counter++;
    }
    
    private ArrayList<TRANSAKSI> daftarTransaksi = new ArrayList<>();

    // MENAMBAH TRANSAKSI
    public void tambah(TRANSAKSI t){
        daftarTransaksi.add(t);
    }

    // MENGHAPUS TRANSAKSI BERDASARKAN ID
    public void hapus(int id){
        daftarTransaksi.removeIf(tr -> tr.getId() == id);
    }

    // MENGAMBIL SEMUA DATA
    public ArrayList<TRANSAKSI> getSemua(){
        return daftarTransaksi;
    }
    
    // MENGHITUNG JUMLAH SALDO
    public double getSaldo() {
    double saldo = 0;
    for (TRANSAKSI t : daftarTransaksi) {
        saldo += t.hitung();
    }
    return saldo;
    }

    public void setSaldo(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
