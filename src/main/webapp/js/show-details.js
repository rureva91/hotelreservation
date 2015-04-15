/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var url = './reva/testfile/';

        $.getJSON(url, function(data) {
            if (!jQuery.isEmptyObject(data)) {
                var fname = data.fname;
                var phone = data.phone;
                var email = data.email;
                var roomtype = data.roomtype;
                var ccard = data.ccard;
                var Card_Number = data.Card_Number;
                var in_date = data.in_date;
                var out_date = data.out_date;
                 $('#fname').text(fname);
                    $('#phone').text(phone);
                    $('#email').text(email);
                    $('#roomtype').text(roomtype);
                    $('#ccard').text(ccard);
                    $('#Card_Number').text(Card_Number);
                    $('#in_date').text(in_date);
                    $('#out_date').text(out_date);
                    window.location.href = "./secondpage.jsp";
            }
        });
           