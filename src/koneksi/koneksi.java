/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author LENOVO
 */
public class koneksi {
    private static Connection mysqlconfig;
    public static Connection configDB() {
        try {
//            String url="jdbc:mysql://103.170.22.65:3306/newsmega_magang"; //url database
//            String user="newsmega_magang"; //user database
//            String pass="magang_2022"; //password database
//            
            String url="jdbc:mysql://localhost:3306/smegamart"; //url database
            String user="root"; //user database
            String pass=""; //password database
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (SQLException e) {
            System.err.println("koneksi gagal :"+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        
        return mysqlconfig;
    }    
}


