package Koneksi;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {

    private Connection koneksi;

    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("berhasil konek");
        } catch (ClassNotFoundException ex) {
            System.out.println("gagal konek" + ex);
        }
        String url = "jdbc:mysql://localhost/responsi2";
        try {
            koneksi = (Connection) DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            System.out.println("gagal konek db" + ex);
        }
        return koneksi;
    }
}
