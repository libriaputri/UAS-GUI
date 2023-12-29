/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Delete {

    koneksi konek = new koneksi();

    public void delete(String nama) {

        try {
            konek.koneksi();

            // Query DELETE
            String sql = "DELETE FROM datamhs WHERE nama = ?";

            // Menggunakan PreparedStatement
            try (PreparedStatement preparedStatement = konek.con.prepareStatement(sql)) {
                // Mengatur parameter PreparedStatement
                preparedStatement.setString(1, nama);

                // Menjalankan query DELETE
                int rowsAffected = preparedStatement.executeUpdate();

                
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
