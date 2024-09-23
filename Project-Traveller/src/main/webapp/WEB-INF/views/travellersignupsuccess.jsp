<!DOCTYPE html>
<html>
<head>
<title>Booking sucess page</title>
</head>
<style>

.background {
	background-color: green;
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: 100% 100%;
}		
	
</style>
<body >


	<header>
		<h1 style="text-align:center ;color:red;">Welcomoe to REDBUS </h1>

		<p style="text-align:center" >
			
			<a href="/home"> home </a> | 
			<a href="/travellersignup"> travellersignup </a> | 
			<a href="/travellerlogin"> travellerlogin </a>
			
		</p>
	</header>
	
	<div class="background">
	<hr>
	
	<h2>Hey Traveller, your booking is success with bus number <span style="color:red;"> ${travellerkey.busNumber}</span> and password is <span style="color:red;"> ${travellerkey.password}</span>.</h2>

	<h2>Booking details are:</h2>
	

	<h3 style="text-align:center">arrivalLocation : ${travellerkey.arrivalLocation}</h3>
	<h3	style="text-align:center">arrivalTime : ${travellerkey.arrivalTime}</h3>
	<h3 style="text-align:center">amenities : ${travellerkey.amenities}</h3>
	<h3 style="text-align:center">busType : ${travellerkey.busType}</h3>
	<h3 style="text-align:center">boardingPoint : ${travellerkey.boardingPoint}</h3>
    <h3 style="text-align:center">departureLocation : ${travellerkey.departureLocation}</h3>
    <h3 style="text-align:center">departureTime : ${travellerkey.departureTime}</h3>
    <h3 style="text-align:center">duration : ${travellerkey.duration}</h3>
    <h3 style="text-align:center">droppingPoint : ${travellerkey.droppingPoint}</h3>
    <h3 style="text-align:center">fare : ${travellerkey.fare} /-</h3>
    
    <p style="text-align:center" >
 <a  href="/travellerlogin"><button > Login Page</button> </a> 
 </p>
	<hr>

    </div>
	<footer>
		<h3 style="text-align:center">copyright@redbus</h3>
	</footer>
</body>
</html>