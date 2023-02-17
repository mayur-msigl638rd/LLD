import java.time.LocalDateTime;
import java.util.Timer;

public class Flight {

	public LocalDateTime departure , arrival;
	public Timer duration;
	public String origin , destination;
	public Flight(LocalDateTime departure, LocalDateTime arrival, Timer duration, String origin, String destination) {
		super();
		this.departure = departure;
		this.arrival = arrival;
		this.duration = duration;
		this.origin = origin;
		this.destination = destination;
	}
	
	
}
