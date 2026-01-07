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
public class DELETE {
    KONEKSI konek = new KONEKSI();
   
    public void delete(int nim) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

              String sql = "delete from identitas where nim = " + nim + "";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
}
