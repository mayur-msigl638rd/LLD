import java.util.*;
import java.io.*;
public class VehicalLog {
public String id , description ,type;
public LocalDateTime creationDate;
public VehicalLog(String id, String description, String type, LocalDateTime creationDate) {
	
	this.id = id;
	this.description = description;
	this.type = type;
	this.creationDate = creationDate;
}

public void update(String id , String description , String type , LocalDateTime creationDate)
{
	this.id = id;
	this.description = description;
	this.type = type;
	this.creationDate = creationDate;
}

public String SearchByType(String type)
{
	return description;
}
}
