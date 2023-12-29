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
 * @author ASUS
 */
public class Insert {

    koneksi konek = new koneksi();

    public void insert(String nama, String nim, String prodi, String ukm) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
            // Gunakan PreparedStatement untuk mencegah SQL Injection
            String sql = "INSERT INTO datamhs (nama, nim, prodi, ukm) VALUES (?, ?, ?, ?)";

            // Menggunakan PreparedStatement
            try (PreparedStatement preparedStatement = konek.con.prepareStatement(sql)) {
                // Mengatur parameter PreparedStatement
                preparedStatement.setString(1, nama);
                preparedStatement.setString(2, nim);
                preparedStatement.setString(3, prodi);
                preparedStatement.setString(4, ukm);

                // Menjalankan query INSERT
                preparedStatement.executeUpdate();
            }

            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }
    }
}
