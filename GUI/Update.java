/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author WINDOWS 10
 */
public class Update {
     koneksi konek = new koneksi();
     
     public void update(String nama, String nim, String prodi, String ukm) {
        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql_nim = "UPDATE datamhs SET nim = '" + nim + "' WHERE nama = '" + nama + "'";
            String sql_prodi = "UPDATE datamhs SET prodi = '" + prodi + "' WHERE nama = '" + nama + "'";
            String sql_jenis = "UPDATE datamhs SET ukm = '" + ukm + "' WHERE nama = '" + nama + "'";

            statement.executeUpdate(sql_nim);
            statement.executeUpdate(sql_prodi);
            statement.executeUpdate(sql_jenis);
            
            statement.close();

            JOptionPane.showMessageDialog(null, "Data berhasil diubah");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
