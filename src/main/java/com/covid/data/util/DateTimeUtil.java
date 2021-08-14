package com.covid.data.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {

	public static String convertDate(String date, String fromFormat, String toFormat) {
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern(fromFormat);
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern(toFormat);
		
		LocalDate parseDate = LocalDate.parse(date, f1);
		return parseDate.format(f2);
	}
}
