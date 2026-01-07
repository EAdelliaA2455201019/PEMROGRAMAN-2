/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package PERTEMUAN_9_MATERI12sampaiMATERI18;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author adellia
 */
public class INSERT {
    KONEKSI konek = new KONEKSI();
   
    public void insert(int nim, String nama, String alamat, String jeniskelamin) {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
         //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jeniskelamin + "')";
         //   String sql = "insert into identitas values('"+ nim + "','" + nama + "','" + alamat + "','" + jeniskelamin + "')";
              String sql = "insert into identitas (nim, nama, alamat, jeniskelamin) values('" + nim + "','" + nama + "','" + alamat + "','" + jeniskelamin + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }

}

