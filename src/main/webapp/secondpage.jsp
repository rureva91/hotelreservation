<%-- 
    Document   : secondpage
    Created on : 8-Apr-2015, 8:08:34 PM
    Author     : c0643680
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <!--      <script src="js/add-details.js" ></script> -->
        <script src="js/show-details.js" ></script>
        <script>
           /* var e_mail = sessionStorage.getItem("email");
            console.log('Email: ' + e_mail);
            var url = './reva/testfile/' + e_mail;
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
                    console.log('first Name: ' + fname);
                    $('#fname').text(fname);
                    $('#phone').text(phone);
                    $('#email').text(email);
                    $('#roomtype').text(roomtype);
                    $('#ccard').text(ccard);
                    $('#Card_Number').text(Card_Number);
                    $('#in_date').text(in_date);
                    $('#out_date').text(out_date);
                    // window.location.href = "./secondpage.jsp";
                }
                else {
                    console.log('inside else');
                }
            });*/
        </script>
        <title>Reservation</title>
        <style>
            @import url(http://fonts.googleapis.com/css?family=Lily+Script+One);
            html{

                background-image: url(images/6.jpg);
                background-repeat: inherit;
                color:white;

            }
            fieldset {
                margin-bottom: 10px;

            }
           
            #color{
                text-align: center;
                color: darkmagenta;
                font-family: Lily Script One;
                font-size: 300%;
            }

            legend {
                padding: 0 2px;
                font-weight: bold;
            }
            label {
                display: inline-block;
                line-height: 1.8;
                vertical-align: top;
            }
            ol {
                margin: 0;
                padding: 0;
            }
            li {
                list-style: none;
                padding: 5px;
                margin: 0;
            }
            fieldset {
                border: none;
                margin: 3px 0 0;
            }
            legend {
                padding: 0 0 5px;
                font-weight: normal;
            }
            label {
                display: block;
                width: auto;
            }
            em {
                font-weight: bold;
                font-style: normal;
                color: #f00;
            }
            label {
                width: 120px; 
            }
            fieldset fieldset label {
                margin-left: 123px;
            }
            section {
                margin-left:40em;
            }
            footer {
                text-align: center;
            }
            p{
                color:chartreuse;
            }
        </style>
    </head>
    <body>


        <h1 id="color">Hotel Reservation</h1>

         <h2><marquee>Booking Confirmed..&nbsp;HAVE A HAPPY STAY!!!</marquee></h2>
        <section id="top">
            
           
            <h3>Billing Information</h3>
            <form action="">
                <fieldset>
                    <h3 id="billing">
                       <label for="fname">Name:
                       <p id="fname"></p></label>

                        <label for="phone">PhoneNumber:</label>
                        <p id="phone"></p>

                        <label for="email">Email Id:</label>
                        <p id="email"></p>

                        <label for="roomtype">Room Type:</label>
                        <p id="roomtype"></p>

                        <label for="cardtype">Card Type:</label>
                        <p id="visa"></p>

                        <label for="Card_Number">Card Number:</label>
                        <p id="Card_Number"></p>

                        <label for="Check_in">Check in:</label>
                        <p id="in_date"></p>

                        <label for="Check_Out">Check Out:</label>
                        <p id="out_date"></p>

                    </h3>
<!--                    <input type="button" id="savebutton"  value="Submit">
                    <input type="reset" id="button"  value="cancel">-->

                    </form>
                </fieldset>
        </section>
        <footer id="bottom">
            <p>&copy; 2015 Revathi Rajendran</p>
        </footer>
    </body>
</html>
