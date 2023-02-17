import java.time.LocalDateTime;

public class Fine {
private LocalDateTime creationDate;
private String bookId , memberID;
private static int fineperday =5;

public int calFinr(int numberOfDays)
{
	return numberOfDays * fineperday;
}
}
