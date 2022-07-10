package DateAndTimeAPI;

import java.time.LocalDate;

public class DateAPI {
	public static void main(String [] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getDayOfWeek());
		
		System.out.println(date.getMonthValue());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		

	}

}
