import java.io.*;
import java.util.*;

public class Show {
private static int idcounter =0;
private int id;
private Date showTime;
private int availableSeats;
private movie mov;
private Theatre theatre;

public Show(int id, Date showTime, movie mov, Theatre theatre) {
	super();
	idcounter+=1;
	this.id = id;
	this.showTime = showTime;
	this.mov = mov;
	this.theatre = theatre;
	this.availableSeats = theatre.getCapacity();
	theatre.getShows().add(this);
}
public Date getShowTime() {
	return showTime;
}
public void setShowTime(Date showTime) {
	this.showTime = showTime;
}
public int getAvailableSeats() {
	return availableSeats;
}
public void setAvailableSeats(int availableSeats) {
	this.availableSeats = availableSeats;
}
public movie getMov() {
	return mov;
}
public void setMov(movie mov) {
	this.mov = mov;
}
public Theatre getTheatre() {
	return theatre;
}
public void setTheatre(Theatre theatre) {
	this.theatre = theatre;
}

public void updateshow()
{
	}


public synchronized Ticket bookTicket(RegisteredUser user , int seats)
{
if(availableSeats >=seats && seats >0)
{
	Ticket ticket = new Ticket();
	availableSeats -= seats;
	
	ticket.setOwner(user.getName());
	ticket.setBookedShow(this);
	ticket.setBookingTime(new Date());
	ticket.setNumberOfSeats(seats);
	System.out.println("Successfully booked");
	user.bookingHistory.add(ticket);
	return ticket;
	
}
else
{
	System.out.println("seats not available");
	return null;
	
}

}

public String toString() {
	return "show{" +
            "id=" + id +
            ", showTIme =" + showTime+
            ", movie =" +movie.getName()+
            ", theatre=" + theatre.getName()+
            ", availableSeats=" + availableSeats+
            '}';
}
 
}

