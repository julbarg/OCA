package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class Periods {

	public void performAnimalEnrichment(LocalDate start, LocalDate end) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) { // check if still before end
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plusMonths(1); // add a month
		}
		
		/*
		 * LocalDate toEpochDay() the number of days since January 1, 1970
		 * LocalDateTime toEpochTime the number of seconds since January 1, 1970
		 */
	}
	
	public void usingPeriods(LocalDate start, LocalDate end, Period period){
		LocalDate upTo = start;
		while (upTo.isBefore(end)){
			System.out.println("give me toy:" + upTo);
			upTo = upTo.plus(period);
		}
		
		Period annually = Period.ofYears(1); // every 1 year
		Period quarterly = Period.ofMonths(3); // every 3 months 
		Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
		Period everyOtherDay = Period.ofDays(2); // every 2 days
		Period everyYearAndWeek = Period.of(1, 0, 7); // every year and 7 days
		
		Period wrong = Period.ofDays(30);
		wrong = Period.ofDays(2); // Don't add days. 2
		System.out.println(wrong.getDays());
		
		/*
		 * Objects it can be used among them
		 */
		LocalDate date = LocalDate.of(2015, 1, 20);
		LocalTime time = LocalTime.of(6, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Period period2 = Period.ofMonths(1);
		System.out.println(date.plus(period2));
		System.out.println(dateTime.plus(period2));
		// System.out.println(time.plus(period2)); // UnsupportedTemporalTypeException
	}
	
	public static void main(String[] args) {
		Periods p = new Periods();
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		p.performAnimalEnrichment(start, end);
		Period period = Period.ofYears(1);
		p.usingPeriods(start, end, period );
		
	}

}
