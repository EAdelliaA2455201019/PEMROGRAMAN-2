/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PEMROGRAMAN_2;

import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author adellia
 */

public class INSERT {
    
    // MEMBUAT OBJEK DARI CLASS KONEKSI
    KONEKSI konek = new KONEKSI();
    
    public void insert(String namaproduk, int hargaproduk) {
        try {
            // MEMANGGIL METHOD DARI CLASS KONEKSI
            konek.koneksi();
            
            // MEMBUAT STATEMENT
            Statement statement = konek.con.createStatement();
            
            // MENYUSUN QUERY SQL
            // PASTIKAN NAMA KOLOM DI DATABASE (nama_produk, harga) SESUAI
            String sql = "INSERT INTO listproduk (nama_produk, harga) VALUES ('"
                    + namaproduk + "','" 
                    + hargaproduk;

            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Produk berhasil ditambahkan.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Produk gagal ditambahkan. : " + e.getMessage());
        }
        
    }

}



