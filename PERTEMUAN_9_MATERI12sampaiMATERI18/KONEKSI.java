/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN_9_MATERI12sampaiMATERI18;

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
            String connectionURL ="jdbc:mysql://localhost:3306/mahasiswa_pemrograman_2?useSSL=false&serverTimezone=UTC";

            String username = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
              con = DriverManager.getConnection(connectionURL, username, password);
           JOptionPane.showMessageDialog(null, "Sukses Koneksi");
        }

        catch(Exception e)
            
        {
        JOptionPane.showMessageDialog(null, e);
        System.exit(0);
        }
}
    public static void main(String[] args) {
        KONEKSI koneksi = new KONEKSI();
        koneksi.koneksi();
    }
}
