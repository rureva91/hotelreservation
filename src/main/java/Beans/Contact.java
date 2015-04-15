/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Beans;

import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author c0643680
 */
public class Contact {
    private String Name;
    private int Phone_number;
    private String Email_id;
    private String Room_type;
    private String Card_Type;
    private int Card_Number;
    private String Check_in;
    private String Check_Out;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(int Phone_number) {
        this.Phone_number = Phone_number;
    }

    public String getEmail_id() {
        return Email_id;
    }

    public void setEmail_id(String Email_id) {
        this.Email_id = Email_id;
    }

    public String getRoom_type() {
        return Room_type;
    }

    public void setRoom_type(String Room_type) {
        this.Room_type = Room_type;
    }

    public String getCard_Type() {
        return Card_Type;
    }

    public void setCard_Type(String Card_Type) {
        this.Card_Type = Card_Type;
    }

    public int getCard_Number() {
        return Card_Number;
    }

    public void setCard_Number(int Card_Number) {
        this.Card_Number = Card_Number;
    }

    public String getCheck_in() {
        return Check_in;
    }

    public void setCheck_in(String Check_in) {
        this.Check_in = Check_in;
    }

    public String getCheck_Out() {
        return Check_Out;
    }

    public void setCheck_Out(String Check_Out) {
        this.Check_Out = Check_Out;
    }

    public Contact() {
    }

    public Contact(String Name, int Phone_number, String Email_id, String Room_type, String Card_Type, int Card_Number, String Check_in, String Check_Out) {
        this.Name = Name;
        this.Phone_number = Phone_number;
        this.Email_id = Email_id;
        this.Room_type = Room_type;
        this.Card_Type = Card_Type;
        this.Card_Number = Card_Number;
        this.Check_in = Check_in;
        this.Check_Out = Check_Out;
    }
     public Contact(JsonObject json) {
        Name = json.getString("Name");
        Phone_number= json.getInt("Phone_number");
        Email_id = json.getString("Email_id");
        Room_type = json.getString("Room_type");
        Card_Type = json.getString("Card_Type");
        Card_Number = json.getInt("Card_Number");
        Check_in = json.getString("Check_in");
        Check_Out = json.getString("Check_Out");
        
    }
    
      public JsonObject toJSON() {
          return Json.createObjectBuilder()
                   .add("Name" , Name)
                   .add("Phone_number" , Phone_number)
                   .add("Email_id" , Email_id)
                   .add("Room_type" , Room_type)
                   .add("Card_Type" , Card_Type)
                   .add("Card_Number" , Card_Number)
                   .add("Check_in" , Check_in)
                   .add("Check_Out" , Check_Out)
                  .build();
    }
}
