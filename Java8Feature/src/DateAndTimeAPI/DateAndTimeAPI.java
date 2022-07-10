package DateAndTimeAPI;

import java.time.LocalDateTime;

public class DateAndTimeAPI {
public static void main(String [] args) {
	LocalDateTime dt = LocalDateTime.now();
	
	System.out.println(dt.getDayOfMonth()+"-"+dt.getMonth()+"-"+dt.getYear());
	
	System.out.println(dt.getHour()+":"+dt.getMinute()+":"+dt.getSecond());
}
}
