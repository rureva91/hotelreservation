/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
    $('#savebutton').click(function() {
        
        var Name = $('#fname').val();
        var Phone_number = $('#phone').val();
        var Email_id = $('#email').val();
        var Room_type = $('#roomtype').val();
        var Card_Type = $('#visa').val();
        var Card_Number = $('#Card').val();
        var Check_in = $('#date').val();
        var Check_Out = $('#date').val();
        if (feedback === '') {
            $("#dialogErr").text("Please enter details.");
        } else {
            $.ajax({
                url: "./reva/testfile/",
                type: 'POST',
                data:  JSON.stringify({
                            "Name" : $('#fname').val(),
                            "Phone_number": $('#phone').val(),
                            "Email_id" :$('#email').val(),
                             "Room_type" : $('#roomtype').val(),
                            "Card_Type": $('#visa').val(),
                            "Card_Number" :$('#Card').val(),
                              "Check_in" : $('#date').val(),
                            "Check_Out": $('#date').val()
                            
                        }),
                contentType: 'application/json; charset=utf-8',
                dataType: 'json',
                success: function(data) {
//                    $("#closeCustomerDialog").click();
//                    $("#dialogErr").text("");
                    window.location.href = "./secondpage.jsp";
                }
            });
            }
    });
  
});
