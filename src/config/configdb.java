/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Zeref
 */
public class configdb {
    public static Connection con;
    public static Connection Con()throws SQLException{
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost/simplecrud","root","");
            System.out.println("Koneksi Sukses");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
}
