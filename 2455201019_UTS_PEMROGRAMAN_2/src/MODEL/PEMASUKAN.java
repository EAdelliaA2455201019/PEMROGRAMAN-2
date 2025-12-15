/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author adellia
 */
public class PEMASUKAN extends TRANSAKSI {

    public PEMASUKAN(int id, String keterangan, double jumlah) {
        super(id, keterangan, jumlah);
    }

    @Override
    public double hitung() {
        return jumlah;
    }

    @Override
    public String getJenis() {
        return "PEMASUKAN";
    }
}


