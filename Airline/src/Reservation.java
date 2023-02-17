import java.time.LocalDateTime;

public class Reservation {
public LocalDateTime creationDate;
public String reservationNumber;
public Flight flight;
public Seat seats;
public Airport destinationAirport, sourceAirport;
public Reservation(LocalDateTime creationDate, String reservationNumber, Flight flight, Seat seats,
		Airport destinationAirport, Airport sourceAirport) {
	super();
	this.creationDate = creationDate;
	this.reservationNumber = reservationNumber;
	this.flight = flight;
	this.seats = seats;
	this.destinationAirport = destinationAirport;
	this.sourceAirport = sourceAirport;
}


public String getResrvationNumber()
{
	return reservationNumber;
	
}

public Flight getFlight()
{
	return flight;
}

public Seat getSeats()
{
	return seats;
}
}
