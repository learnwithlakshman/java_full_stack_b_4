package com.careerit.cj.day14;

public class EnumTest {

	

	public static void tellItLikeItIs(Day day) {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;

		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	public static void main(String[] args) {
		
		tellItLikeItIs(Day.MONDAY);
		tellItLikeItIs(Day.THURSDAY);
		tellItLikeItIs(Day.FRIDAY);
		
		for(Day day:Day.values()) {
			System.out.println(day);
		}
		
		Day day = Day.SUNDAY;
		System.out.println(day.toString());
		
		Day day_1 = Day.valueOf("MONDAY");
		Day day_2 = Day.MONDAY;
		
		System.out.println(day_1 == day_2);
		System.out.println(day_1.equals(day_2));
		
		
	}
}
