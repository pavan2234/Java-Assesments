package task6;


import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class CheckingDate {
	DateTimeFormatter obj= DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
	LocalDateTime today=LocalDateTime.now();
	public void earlierOrNot(String userDate) {
		LocalDateTime myDate = LocalDateTime.parse(userDate, obj);
		if (myDate.isBefore(today)) {
			System.out.println(userDate + " is in the past.");
		}
	}
	public void AfterOrNot(String userDate) {
		LocalDateTime myDate = LocalDateTime.parse(userDate, obj);
		if (myDate.isAfter(today)) {
			System.out.println(userDate + " is in the future.");
		}
	}
	public void converter(String userDate) {
		DateTimeFormatter obj1= DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
		LocalDateTime myDate = LocalDateTime.parse(userDate, obj1);
		System.out.println(myDate);
	}

}
