package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimes {
	
	/*
	 * Java 8 Date only java.time.*;
	 * LocalDate - Just date
	 * LocalTime - Just a time
	 * LocalDateTime - Both
	 */
	
	public void local(){
		System.out.println(LocalDate.now()); // 2016-11-22
		System.out.println(LocalTime.now()); // 10:30:24.336
		System.out.println(LocalDateTime.now()); // 2016-11-22T10:30:24.336
	}
	
	public void create() {
		/*
		 * public static LocalDate of(int year, Month month, int dayOfMonth)
		 * public static LocalDate of(int year, int month, int dayOfMonth)
		 */
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		/*
		 * public static LocalTime of(int hour, int minute)
		 * public static LocalTime of(int hour, int minute, int second)
		 * public static LocalTime of(int hour, int minute, int second, int nanos)
		 */
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6,  15, 30, 200); // + nanosecods
		
		/*
		 * public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute)
		 * public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute, int second)
		 * public static LocalDateTime of(int year, int month,int dayOfMonth, int hour, int minute, int second, int nanos)
		 * public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute)
		 * public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute, int second)
		 * public static LocalDateTime of(int year, Month month,int dayOfMonth, int hour, int minute, int second, int nanos)
		 * public static LocalDateTime of(LocalDate date, LocalTime)
		 */
		LocalDateTime dataTime1 = LocalDateTime.of(2015, Month.FEBRUARY, 20, 6, 15, 30);
		LocalDateTime dataTime2 = LocalDateTime.of(date1, time1);
		
		// LocalDate d = new LocalDate(); // DOES NOT COMPILE
		// LocalDate.of(2016, Month.FEBRUARY, 29); // throws DateTimeException
	}
	
	public void manipulate() {
		/*
		 * The date and time classes are immutable
		 * We need to remeber to assign the result of these methods to a reference
		 * varibale so they are not lost
		 */
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // 2014-01-20
		date = date.plusDays(2);
		System.out.println(date); // 2014-01-22
		date = date.plusWeeks(1);
		System.out.println(date); // 2014-01-29
		date = date.plusDays(2);
		System.out.println(date); // 2014-01-31
		date = date.plusMonths(1);
		System.out.println(date); // 2014-02-28
		date = date.plusYears(5);
		System.out.println(date); // 2019-02-28
		
		LocalDate dateOne = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(dateOne, time);
		dateTime = dateTime.minusDays(1);
		dateTime = dateTime.minusHours(10);
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime);
		
		/*
		 * Time methods to be chained
		 */
		LocalDate dateThree = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime timeOne = LocalTime.of(5, 17);
		LocalDateTime dateTimeOne = LocalDateTime.of(dateThree, timeOne).minusDays(1).minusHours(10).minusSeconds(30);
		
		/*
		 * Tricky
		 */
		LocalDate local = LocalDate.of(2020, Month.JANUARY, 20);
		date.plusDays(10); // It is inmutable, you need to assign again
		System.out.println(local); // 2020-01-20
		
		LocalDate datew = LocalDate.of(2020, Month.JANUARY, 20);
		// datew = datew.plusMinutes(1); // DOES NOT COMPILE
		
	}
	
	public static void main(String[] args) {
		DateTimes dt = new DateTimes();
		dt.local();
		dt.create();
		dt.manipulate();
	}

}
