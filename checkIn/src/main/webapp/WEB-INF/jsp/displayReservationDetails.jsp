<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>FLight Details</h2>
	Flight number:${reservation.flight.flightNumber}
	<br> Operating Airline:${reservation.flight.operatingAirline}
	<br> Departure City:${reservaitn.flight.departureCity}
	<br> Arrival City:${reservation.flight.arrivalCity}
	<br> Date of Departure:${reseraiton.flight.dateOfDeparture }
	<br> Estimated departure
	time:${reservation.flight.estimatedDepartureTime}
	<br>
	<h2>Passenger Details</h2>
	First name:${reservation.passenger.firstName}
	<br> Last name:${reservation.passenger.lastName}
	<br> email:${reservation.passenger.email }
	<br> phone:${reservation.passenger.phone }

	<form action="completeCheckIn" method="post">
		Enter the Number of Bags you want to check in:<input type="text"
			name="numberOfBags" />
    <input type="text" value="${reservation.id}" name="reservationId"> 
    <input type="submit" value="Check In">
	</form>
</body>
</html>