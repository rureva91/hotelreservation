<%-- 
    Document   : firstpage
    Created on : 8-Apr-2015, 6:38:37 PM
    Author     : c0643680
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/add-details.js" ></script>
        
        <title>Reservation</title>
            <style>
                @import url(http://fonts.googleapis.com/css?family=Lily+Script+One);
                html{
                    
                    background-image: url(images/6.jpg);
                    background-repeat: inherit;
                    color: chartreuse;
                    
                }
                fieldset {
                    margin-bottom: 10px;
                   
                }
                #color{
                    text-align: center;
                    color: red;
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
        <h2>Billing Information(required)</h2>
         <form method="post">
        <fieldset>
         		<h3 id="billing">
	        	<label for="fname">Name:</label>
                        <input type="text" name="fname" id="fname"><br>  
                        <label for="phone">PhoneNumber:</label>
                        <input type="text" name="phone" id="phone"><br>
                        <label for="email">Email Id:</label>
                        <input type="text" name="email" id="email"><br>
                        <label for="roomtype">Room Type:</label>
				<select name="roomtype" id="roomtype">
				    <option>Single</option>
				    <option>Double</option>            
				</select>
                        
				<br>
                        <label for="cardtype">Card Type:</label>
                        <label for="visa">
                               <input type="radio" name="ccard" id="visa" value="visa">VISA
			</label>   
                        <label for="master">
				<input type="radio" name="ccard" id="visa" value="master">MASTER				
                        </label><br>
                                
                        <label for="Card_Number">Card Number:</label>
                        <input type="text" name="Card_Number" id="Card"><br>
                        <label for="Check_in">Check in:</label>
                        <input type="text" name="date" id="date" value=""><br>
                        <label for="Check_Out">Check Out:</label>
                        <input type="text" name="date" id="date" value=""><br>
			</h3>
         	<input type="Reset" id="button"  value="Reset">
                <input type="submit" id="savebutton"  value="Submit">
                <input type="submit" id="button"  value="cancel">
         </form>
        </fieldset>
    </section>
        <footer id="bottom">
		<p>&copy; 2015 Revathi Rajendran</p>
	</footer>
 </body>
</html>
