
public class Seat {

	public int seatNumber;
	public ClassType type;
	public SeatCategory category;
	public Seat(int seatNumber, ClassType type, SeatCategory category) {
		super();
		this.seatNumber = seatNumber;
		this.type = type;
		this.category = category;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public ClassType getType() {
		return type;
	}
	public void setType(ClassType type) {
		this.type = type;
	}
	public SeatCategory getCategory() {
		return category;
	}
	public void setCategory(SeatCategory category) {
		this.category = category;
	}
	
	
	
}
