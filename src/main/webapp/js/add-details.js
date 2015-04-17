/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function() {
      
    $('#savebutton').click(function() {
        var fname = $('#fname').val();
        var phone = $('#phone').val();
        var email = $('#email').val();
        e_mail = email;
        var roomtype = $('#roomtype').val();
        var ccard = $('#visa').val();
        var Card_Number = $('#Card_Number').val();
        var in_date = $('#in_date').val();
        var out_date = $('#out_date').val();
        var res = {
            Name: $('#fname').val(),
            Phone_number: $('#phone').val(),
            Email_id: $('#email').val(),
            Room_type: $('#roomtype').val(),
            Card_Type: "visa",
            Card_Number: $('#Card_Number').val(),
            Check_in: $('#in_date').val(),
            Check_Out: $('#out_date').val()
        };
        //alert(res);
        if (fname === '' && phone === '' && email === '' && roomtype === '' && ccard === '' && Card_Number === ''
                && in_date === '' && out_date === '') {
            $("#errorMsg").text("All fields are required.");
        } else {
            $.ajax({
                url: './reva/testfile/',
                type: 'POST',
                data: JSON.stringify(res),
                contentType: 'application/json; charset=utf-8',
                dataType: 'json', 
                success: function(data) {
                    $("#errorMsg").text("");
                    $('#Sfname').val(fname);
                    $('#Sphone').val(phone);
                    $('#Semail').val(email);
                    sessionStorage.setItem("email",email);
                    $('#Sroomtype').val(roomtype);
                    $('#Sccard').val(ccard);
                    $('#SCard_Number').val(Card_Number);
                    $('#Sin_date').val(in_date);
                    $('#Sout_date').val(out_date);
                    window.location.href = "./secondpage.jsp";
                }
            });
        }
    });
    
    
    
});
