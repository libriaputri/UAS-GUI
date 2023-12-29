/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class koneksi {
    String statusKoneksi = null;

    Connection con = null;
    public void koneksi()
    {
        try
        {
            String connectionURL = "jdbc:mysql://localhost:3306/pendaftaranukm";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
            statusKoneksi = "Berhasil";
        }

        catch(Exception e)
        {
       
            statusKoneksi = "Gagal";
        }
}
    public static void main(String[] args) {
        koneksi koneksi = new koneksi();
        koneksi.koneksi();
    }
}

