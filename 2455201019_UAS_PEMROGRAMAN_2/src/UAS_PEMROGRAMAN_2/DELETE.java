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

public class DELETE {
    
    // MEMBUAT OBJEK DARI CLASS KONEKSI
    KONEKSI konek = new KONEKSI();
    
    public void deleteProduk(String idproduk) {
        try {
            // MEMANGGIL METHOD DARI CLASS KONEKSI
            konek.koneksi();
            
            // MEMBUAT STATEMENT
            Statement statement = konek.con.createStatement();
            
            // MENYUSUN QUERY SQL
            // PASTIKAN NAMA KOLOM DI DATABASE SESUAI
             String sql = "DELETE FROM produk WHERE id_produk = " + idproduk;
           
            // MENJALANKAN PERINTAH UPDATE
            statement.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "produk berhasil dihapus");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "gagal hapus produk : " + e.getMessage());
        }
    }
}
