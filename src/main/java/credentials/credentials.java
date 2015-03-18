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
     public static Connection getConnection() throws SQLException {
        String hostname = System.getenv("OPENSHIFT_MYSQL_DB_HOST");
        String port = System.getenv("OPENSHIFT_MYSQL_DB_PORT");
        String username = System.getenv("OPENSHIFT_MYSQL_DB_USERNAME");
        String password = System.getenv("OPENSHIFT_MYSQL_DB_PASSWORD");

        String jdbc = "jdbc:mysql://" + hostname + ":" + port + "/hotelreservation";
        return DriverManager.getConnection(jdbc, username, password);
    }

    public static JsonArray getResults(String sql, String... params) {
        JsonArray json = null;
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pstmt.setString(i + 1, params[i]);
            }
            ResultSet rs = pstmt.executeQuery();

            JsonArrayBuilder array = Json.createArrayBuilder();
            while (rs.next()) {
                array.add(Json.createObjectBuilder()
                        .add("name", rs.getInt("name"))
                        .add("phone number", rs.getInt("phone number"))
                        .add("email id", rs.getString("email id"))
                        .add("room type", rs.getString("room type"))
                        .add("card type", rs.getString("card type"))
                        .add("card number", rs.getInt("card number"))
                        .add("check in", rs.getString("check in"))
                        .add("check out", rs.getString("check out"))
                );
            }
            json = array.build();
        } catch (SQLException ex) {
            Logger.getLogger(credentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        return json;
    }
    
    public static int doUpdate(String sql, String... params) {
        int result = -1;
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pstmt.setString(i + 1, params[i]);
            }
            result = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(credentials.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
