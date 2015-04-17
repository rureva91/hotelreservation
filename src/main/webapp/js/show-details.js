/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function() {
    var e_mail = sessionStorage.getItem("email");
    console.log('Email: '+e_mail);
    var url = './reva/testfile/'+e_mail;
    console.log('url: '+url)
    $.getJSON(url, function(data) {
        console.log('inside get json');
        if (!jQuery.isEmptyObject(data)) {
            //alert(data);
            var fname = data.Name;
            var phone = data.Phone_number;
            var email = data.Email_id;
            var roomtype = data.Room_type;
            var ccard = data.Card_Type;
            var Card_Number = data.Card_Number;
            var in_date = data.Check_in;
            var out_date = data.Check_Out;
            console.log('first Name: ' + fname);
            $('#fname').text(fname);
            $('#phone').text(phone);
            $('#email').text(email);
            $('#roomtype').text(roomtype);
            $('#visa').text(ccard);
            $('#Card_Number').text(Card_Number);
            $('#in_date').text(in_date);
            $('#out_date').text(out_date);
            // window.location.href = "./secondpage.jsp";
        }
        else {
            console.log('inside else');
        }
    });
});
           