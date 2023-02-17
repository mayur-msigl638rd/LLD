import java.time.LocalDateTime;

public class Job {
public String jobId, description , companyName;
LocalDateTime lastDate;
public Job(String jobId, String description, String companyName, LocalDateTime lastDate) {
	super();
	this.jobId = jobId;
	this.description = description;
	this.companyName = companyName;
	this.lastDate = lastDate;
}


}
