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
        <script src="js/add-details.js" ></script>
        <script src="js/show-details.js" ></script>
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
        </style>
    </head>
    <body>


        <h1 id="color">Hotel Reservation</h1>


        <section id="top">
            <h2>Billing Information</h2>
            <form action="">
                <fieldset>
                    <h3 id="billing">
                        <label for="Sfname">Name:</label>
                         
                        <label for="Sphone">PhoneNumber:</label>
                        
                        <label for="Semail">Email Id:</label>
                        
                        <label for="Sroomtype">Room Type:</label>
                       
                        <label for="cardtype">Card Type:</label>

                        <label for="SCard_Number">Card Number:</label>
                       
                        <label for="SCheck_in">Check in:</label>
                       
                        <label for="SCheck_Out">Check Out:</label>
                     
                    </h3>
                    <input type="button" id="savebutton"  value="Submit">
                    <input type="reset" id="button"  value="cancel">

            </form>
        </fieldset>
    </section>
    <footer id="bottom">
        <p>&copy; 2015 Revathi Rajendran</p>
    </footer>
</body>
</html>
