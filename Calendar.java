package com.bridgelabz.data_structure;

import java.util.Scanner;

public class Calendar {

	// filling a 2D-Array in a calendar format.
	public static void fillArray(String[][] days, int month, int year) {
		
		int daysInMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int dayCount = 1;
		String weekDays[] = {"S", "M", "T", "W", "Th", "F", "Sa"," "};
		int startDay = dayOfWeek(1, month, year);                             // getting the starday of month
		int j = 0;
		if (isLeapYear(year)) {
			daysInMonth[2] = 29;                                              // if year is leap year then assign 29 days for FEBRUARY month.
		}
		for (int i = 0; i < 7; i++) {
			days[j][i] = weekDays[i];                                         // filling weekDays means S , M , T , W , Th , F , Sa in an array.
		}

		for (int i = 1; i < 7; i++) {
			for (j = 0; j < 7; j++)
				if (startDay >= dayCount) {
					days[i][j] = " ";                                         // filling spaces untill it reaches the start day.
					startDay--;                                               // decrementing the startDays.

				} else if (dayCount <= daysInMonth[month]) {
					days[i][j] = String.valueOf(dayCount);                    // this will fill the dayCount value in an array until the dayCount value reaches the maximum days in a month.
					dayCount++;                                               // incrementing the dayCount.
				} else {
					days[i][j] = " ";                                         // filling spaces for the remaining empty days in a month.
				}
		}
	}

	// printing calendar method
	public static void printCalender(String[][] days, int month, int year) {
		
		// TODO Auto-generated method stub
		String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December" };
		System.out.println("                 " + months[month - 1] + "--" + year);
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(days[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// finding whether the given year is a leap year or not.
	public static boolean isLeapYear(int year) {
		boolean isLeapYear;
		
		// divisible by 4
		isLeapYear = (year % 4 == 0);
		
		// divisible by 4 and not by 100
		isLeapYear = isLeapYear && (year % 100) != 0;
		
		// divisible by 4 and 400
		isLeapYear = isLeapYear || (year % 400) == 0;
		return isLeapYear;
	}

	// formulas to find in which week the month is going to start in a month.
	public static int dayOfWeek(int day, int month, int year) {
		int m0, y0, d0, x;

		y0 = year - (14 - month) / month;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = month + 12 * ((14 - month) / 12) - 2;
		d0 = (day + x + (31 * m0) / 12) % 7;
		return d0;                                                 // returning the number in which week the first day in month is going to start EXAMPLE:- 3-->Wednesday.
	}

	// Main method
	public static void main(String[] args) {
		
		System.out.println("\t WELCOME TO CALENDAR \n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter month :- ");
		int month = input.nextInt();
		System.out.print("Enter year :- ");
		int year = input.nextInt();
		String[][] days = new String[7][7];

		fillArray(days, month, year);                                // calling fillarray static method by passing parameters of an empty array for days and month and year.
		System.out.println("\n                 Java Calendar");
		printCalender(days, month, year);                            // printing calendar
	}
}
