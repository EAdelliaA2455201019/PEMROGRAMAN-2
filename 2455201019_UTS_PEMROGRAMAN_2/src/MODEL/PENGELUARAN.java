/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author adellia
 */
public class PENGELUARAN extends TRANSAKSI {

    public PENGELUARAN(int id, String keterangan, double jumlah) {
        super(id, keterangan, jumlah);
    }

    @Override
    public String getJenis() {
        return "PENGELUARAN";
    }
    
     @Override
    public double hitung() {
        return -jumlah; 
    }
}

