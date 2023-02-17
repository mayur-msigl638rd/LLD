
public class TicketBookingThread extends Thread {
	private Show show;
	private RegisteredUser user;
	private int numberOfSeats;
	private Ticket ticket;
	public TicketBookingThread(Show show, RegisteredUser user, int numberOfSeats) {
		super();
		this.show = show;
		this.user = user;
		this.numberOfSeats = numberOfSeats;
	}
	public void run()
	{
		this.ticket = show.bookTicket(user ,  numberOfSeats);
	}
	public Ticket getTicket()
	{
		return ticket;
		
	}

}
