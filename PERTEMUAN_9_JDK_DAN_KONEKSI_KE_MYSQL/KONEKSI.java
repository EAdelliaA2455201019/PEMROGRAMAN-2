/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN_9_JDK_DAN_KONEKSI_KE_MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author adellia
 */
public class KONEKSI {
    
    Connection con=null;
    
    String statusKoneksi;
    public void koneksi()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost/mahasiswa_pemrograman_2";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
            // JOptionPane.showMessageDialog(null, "Sukses Koneksi");
            statusKoneksi = "Berhasil";
        }

        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        statusKoneksi = "Gagal";
        System.exit(0);
        }
}
    
    public static void main(String[] args) {
        KONEKSI teskoneksi = new KONEKSI();
        teskoneksi.koneksi();
    }
    
    
}
