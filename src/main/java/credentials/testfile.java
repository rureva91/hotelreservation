/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credentials;

import java.io.StringReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.json.stream.JsonParser;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author c0643680
 */
@Path("/testfile")
public class testfile {

    @GET
    @Produces("application/json")
    public String doGet() {
        String str = getResults("SELECT * FROM HotelReservation");
        System.out.println(str);
        return str;
    }

    @GET
    @Path("{id}")
    @Produces("application/json")
    public String doGet(@PathParam("id") String id) {
        String str = getResults("SELECT * FROM HotelReservation where Email_id=?", id);
        return str;
    }

  
    private String getResults(String query, String... params) {
        JsonArrayBuilder productArray = Json.createArrayBuilder();
        String myString = new String();
         try (Connection conn = credentials.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            for (int i = 1; i <= params.length; i++) {
                pstmt.setString(i, params[i - 1]);
            }

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                JsonObjectBuilder jsonob = Json.createObjectBuilder()
                        .add("Name", rs.getString("Name"))
                        .add("Phone_number", rs.getInt("Phone_number"))
                        .add("Email_id", rs.getString("Email_id"))
                        .add("Room_type", rs.getString("Room_type"))
                        .add("Card_Type", rs.getString("Card_Type"))
                        .add("Card_Number", rs.getInt("Card_Number"))
                        .add("Check_in", rs.getString("Check_in"))
                        .add("Check_Out", rs.getString("Check_Out"));

                myString = jsonob.build().toString();
                productArray.add(jsonob);
            }

        } catch (SQLException ex) {
            Logger.getLogger(testfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (params.length == 0) {
            myString = productArray.build().toString();
        }
        return myString;
    }
    @POST
    @Consumes("application/json")
    public void doPost(String str) {
        JsonParser parser = Json.createParser(new StringReader(str));
        Map<String, String> map = new HashMap<>();
        String name = "", value;

        while (parser.hasNext()) {
            JsonParser.Event evt = parser.next();
            switch (evt) {
                case KEY_NAME:
                    name = parser.getString();
                    break;
                case VALUE_STRING:

                    value = parser.getString();
                    map.put(name, value);
                    break;
                case VALUE_NUMBER:
                    value = Integer.toString(parser.getInt());
                    map.put(name, value);
                    break;
            }
        }
        System.out.println(map);
        String Name = map.get("Name");
        String Phone_number = map.get("Phone_number");
        String Email_id = map.get("Email_id");
        String Room_type = map.get("Room_type");
        String Card_Type = map.get("Card_Type");
        String Card_Number = map.get("Card_Number");
        String Check_in = map.get("Check_in");
        String Check_Out = map.get("Check_Out");
        doUpdate("insert into HotelReservation ( Name, Phone_number, Email_id, Room_type, Card_Type, Card_Number, Check_in, Check_Out) values ( ?, ?, ?, ?, ?, ?, ?, ?)", Name, Phone_number, Email_id, Room_type, Card_Type, Card_Number, Check_in, Check_Out);
    }

        private int doUpdate(String query, String... params) {
        int numChanges = 0;
        try (Connection conn = credentials.getConnection()) {
            PreparedStatement pstmt = conn.prepareStatement(query);
            for (int i = 1; i <= params.length; i++) {
                pstmt.setString(i, params[i - 1]);
            }
            numChanges = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(testfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numChanges;
    }
        
 @PUT
    @Path("{id}")
    @Consumes("application/json")
    public void doPut(@PathParam("id") String id, String str) {
        JsonParser parser = Json.createParser(new StringReader(str));
        Map<String, String> map = new HashMap<>();
        String name = "", value;
        while (parser.hasNext()) {
            JsonParser.Event event = parser.next();
            switch (event) {
                case KEY_NAME:
                    name = parser.getString();
                    break;
                case VALUE_STRING:
                    value = parser.getString();
                    map.put(name, value);
                    break;
                case VALUE_NUMBER:
                    value = Integer.toString(parser.getInt());
                    map.put(name, value);
                    break;
            }
        }
        System.out.println(map);

        String Name = map.get("Name");
        String Phone_number = map.get("Phone_number");
        String Email_id = map.get("Email_id");
        String Room_type = map.get("Room_type");
        String Card_Type = map.get("Card_Type");
        String Card_Number = map.get("Card_Number");
        String Check_in = map.get("Check_in");
        String Check_Out = map.get("Check_Out");
        doUpdate("update HotelReservation set Name = ?, Phone_number = ?, Email_id = ?, Room_type = ?, Card_Type = ?, Card_Number = ?, Check_in = ?, Check_Out = ? where Email_id = ?", Name, Phone_number, Email_id, Room_type, Card_Type, Card_Number, Check_in,Check_Out,id);

    }

    @DELETE
    @Path("{id}")
    public void doDelete(@PathParam("id") String id, String str) {
        doUpdate("delete from HotelReservation where Email_id = ?", id);
    }

}


