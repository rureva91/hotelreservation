/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentials;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.core.Response;

/**
 *
 * @author c0643680
 */
public class credentials {

//    public static Connection getConnection() throws SQLException {
//        String hostname = System.getenv("OPENSHIFT_MYSQL_DB_HOST");
//        String port = System.getenv("OPENSHIFT_MYSQL_DB_PORT");
//        String username = System.getenv("OPENSHIFT_MYSQL_DB_USERNAME");
//        String password = System.getenv("OPENSHIFT_MYSQL_DB_PASSWORD");
//
//        String jdbc = "jdbc:mysql://" + hostname + ":" + port + "/hotelreservation";
//        return DriverManager.getConnection(jdbc, username, password);
//    }
    public static Connection getConnection() throws SQLException {

        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String jdbc = "jdbc:mysql://localhost/hotelreservation";
            String user = "root";
            String pass = "";
            System.out.println(jdbc);
            conn = (Connection) DriverManager.getConnection(jdbc, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(credentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;

    }
}



