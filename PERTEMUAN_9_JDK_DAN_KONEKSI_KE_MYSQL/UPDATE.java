/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_9_JDK_DAN_KONEKSI_KE_MYSQL;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author adellia
 */
public class UPDATE {
     KONEKSI konek = new KONEKSI();

 // String nama, String alamat, String jenis
    public void update(int nim, String nama, String alamat, String jenis) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            String sql_alamat = "update mhs_ilkom set alamat='" + alamat + "'where nim='" + nim + "'";
            String sql_nama = "update mhs_ilkom set nama='" + nama + "'where nim='" + nim + "'";
            String sql_jenis ="update mhs_ilkom set jeniskelamin='" + jenis + "'where nim='" + nim + "'";

// String sql_nim = "update identitas set nim ='" + nim + "' where nim = '" + nim + "'";
// String sql = "update identitas set nim ='" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
statement.executeUpdate(sql_nama);
statement.executeUpdate(sql_alamat);
statement.executeUpdate(sql_jenis);
statement.close();

JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
