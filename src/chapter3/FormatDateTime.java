package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDateTime {
	
	public void print() {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date.getDayOfWeek()); // MONDAY
		System.out.println(date.getMonth()); // JANUARY
		System.out.println(date.getMonthValue()); // 1
		System.out.println(date.getYear()); // 2020
		System.out.println(date.getDayOfYear()); // 20
	}
	
	public void format() {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		System.out.println();
		
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
		System.out.println();
		
		/*
		 * DateTimeFormatter
		 */
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dateTime));
		System.out.println(shortDateTime.format(date));
		// System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException
		
		System.out.println();
		
		/*
		 * The format() method is declared on both the formatter objects and the data/time objects
		 */
		DateTimeFormatter shortDateTime2 =DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(dateTime.format(shortDateTime2));
		System.out.println(date.format(shortDateTime2));
		// System.out.println(time.format(shortDateTime2)); // UnsupportedTemporalTypeException
		
		System.out.println();
		
		DateTimeFormatter shortDateTime3 =DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(dateTime.format(shortDateTime3));
		System.out.println(date.format(shortDateTime3));
		// System.out.println(time.format(shortDateTime2)); // UnsupportedTemporalTypeException
		
		System.out.println();
		
		DateTimeFormatter shortDateTime4 =DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(dateTime.format(shortDateTime4));
		System.out.println(date.format(shortDateTime4));
		// System.out.println(time.format(shortDateTime2)); // UnsupportedTemporalTypeException
		
		System.out.println();
		
		/*
		 * LocalizedDateTime
		 */
		date = LocalDate.of(2020, Month.JANUARY, 1);
		time = LocalTime.of(11, 12, 34);
		dateTime = LocalDateTime.of(date, time);
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
		System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM
		
		System.out.println();
		
		/*
		 * Patterns
		 * MMMM
		 * 		M 1
		 * 		MM 01
		 * 		MMM Jan
		 * 		MMMM January
		 * dd d represents days
		 * yyyy 
		 * 		y year
		 * 		yy two-digit year
		 * 		yyyy four-digit year
		 */
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime.format(f));
		
		f = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(f.format(dateTime));
		System.out.println(f.format(time));
		// System.out.println(f.format(date)); // ClockHourOfAmPm
		
		System.out.println();
		
	}
	
	public void parsing(){
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyy");
		LocalDate date = LocalDate.parse("01 02 2015", f);
		LocalTime time = LocalTime.parse("11:22");
		System.out.println(date);
		System.out.println(time);
	}
	
	public static void main(String[] args) {
		FormatDateTime fd = new FormatDateTime();
		fd.print();
		fd.format();
		fd.parsing();
		
	}

}
