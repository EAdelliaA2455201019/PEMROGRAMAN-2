/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PEMROGRAMAN_2;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author adellia
 */

public class UPDATE {
    
    // MEMBUAT OBJEK DARI CLASS KONEKSI
    KONEKSI konek = new KONEKSI();
    
    private String idProduk;
    
    public void updateProduk(String namaproduk, int hargaproduk) {
        try {
            // MEMANGGIL METHOD DARI CLASS KONEKSI
            konek.koneksi();
            
            // MEMBUAT STATEMENT
            Statement statement = konek.con.createStatement();
            
            // MENYUSUN QUERY SQL
            // PASTIKAN NAMA KOLOM DI DATABASE (nama_produk, harga) SESUAI
            String sql = "UPDATE listproduk SET "
                   + "nama_produk = '" + namaproduk + "', "
                   + "harga = '" + hargaproduk + "' "
                   + "WHERE id_produk = '" + idProduk + "'";
            
            // MENJALANKAN PERINTAH UPDATE
            statement.executeUpdate(sql);
            
            System.out.println("Data berhasil diupdate!");
        
        } catch (Exception e) {
            
            System.out.println("Gagal update: " + e.getMessage());
        }
    }
}
