/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package credentials;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author c0643680
 */
public class testfile {
    @Path("/testfile")
    
//    @GET
//    @Produces("application/json")
//    public String doGet() {
//        String str = getResults("SELECT * FROM HotelReservation");
//        return str;
//    }

    @GET
//    @Path("{id}")
    @Produces("application/json")
    public String doGet(@PathParam("id") String id) {
        String str = getResults("SELECT * FROM HotelReservation where name=?", id);
        return str;
    }
    private String getResults(String query, String... params) {
        JsonArrayBuilder productArray = Json.createArrayBuilder();
        String numChanges = new String();
        try (Connection conn = credentials.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            for (int i = 1; i <= params.length; i++) {
                pstmt.setString(i, params[i - 1]);
            }

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                JsonObjectBuilder jsonobj = Json.createObjectBuilder()
                        .add("name", rs.getInt("name"))
                        .add("phone number", rs.getInt("phone number"))
                        .add("email id", rs.getString("email id"))
                        .add("room type", rs.getString("room type"))
                        .add("card type", rs.getString("card type"))
                        .add("card number", rs.getInt("card number"))
                        .add("check in", rs.getString("check in"))
                        .add("check out", rs.getString("check out"));

                numChanges = jsonobj.build().toString();
                productArray.add(jsonobj);
            }

        } catch (SQLException ex) {
            Logger.getLogger(testfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (params.length == 0) {
            numChanges = productArray.build().toString();
        }
        return numChanges;
    }
}
