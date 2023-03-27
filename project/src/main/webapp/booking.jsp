<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check Flights</title>
</head>
<body background="https://webcdn.infiniteflight.com/static/images/bg_08.jpg">
<h1><center>FlyAway</center></h1>
<h2><center>Airline Booking Portal</center></h2><br>
<h3>Check available flights</h3><font size="6" color="red">
<form action="flightsearch" method="get">
Date : <input name="date" type="date" required/>
Source :
<select name="source" required>
<option></option>
<option value="Hyderabad">Hyderabad</option>
<option value="Delhi">Delhi</option>
<option value="Mumbai">Mumbai</option>
<option value="Chennai">Chennai</option>
<option value="Banglore">Banglore</option>
</select>
Destination :
<select name="destination" required>

<option></option>
<option value="Hyderabad">Hyderabad</option>
<option value="Delhi">Delhi</option>
<option value="Mumbai">Mumbai</option>
<option value="Chennai">Chennai</option>
<option value="Banglore">Banglore</option>
</select>
Number of persons:
<input type="number" name="persons" required/>
<input type="submit" value="check"/>
</form>
${message}
<br><a href="home.html" style="text-decoration:none"><font size="5" color="black">Back</font></a>
</body>
</html>