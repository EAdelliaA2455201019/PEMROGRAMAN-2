/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_9_MATERI12sampaiMATERI18;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author adellia
 */
public class UPDATE {
     KONEKSI konek = new KONEKSI();

 // String nama, String alamat, String jenis
    public void update(int nim, String nama, String alamat, String jeniskelamin) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_alamat = "update identitas set alamat='" + alamat + "'where nim='" + nim + "'";
            String sql_nama = "update identitas set nama ='" + nama + "'where nim='" + nim + "'";
            String sql_jeniskelamin ="update identitas set jeniskelamin='" + jeniskelamin + "'where nim='" + nim + "'";

// String sql_nim = "update identitas set nim ='" + nim + "' where nim = '" + nim + "'";
// String sql = "update identitas set nim ='" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
statement.executeUpdate(sql_nama);
statement.executeUpdate(sql_alamat);
statement.executeUpdate(sql_jeniskelamin);
statement.close();

JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
