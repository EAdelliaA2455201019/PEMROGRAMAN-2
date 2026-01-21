/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PEMROGRAMAN_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adellia
 */
// CLASS KONEKSI BERFUNGSI SEBAGAI PENGHUBUNG ANTARA JAVA DAN DATABASE MYSQL
// MODIFIER: kata kunci untuk menentukan level atau tingkat akses member dan class.
// JENIS - JENIS MODIFIER : public, private, dan protected
public class KONEKSI {
    
    
    // CONNECTION: TIPE DATA DARI java.sql
    // con: NAMA VARIABEL, digunakan untuk menyimpan objek koneksi database.
    public Connection con;
    
    // METHOD YANG DIPANGGIL UNTUK MENDAPATKAN KONEKSI DATABASE
    public Connection koneksi() {
        try {
            // JIKA SUDAH ADA KONEKSI, LANGSUNG KEMBALIKAN (TANPA POP-UP)
            if (con != null && !con.isClosed()) {
                return con;
            }

            // PROSES KONEKSI PERTAMA KALI
            String connectionURL = "jdbc:mysql://localhost/db_topup_ml";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
            
            // POP-UP INI HANYA AKAN MUNCUL SEKALI (SAAT con MASIH NULL)
            JOptionPane.showMessageDialog(null, "koneksi berhasil");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal: " + e.getMessage());
        }
        return con;
    }
}
    
