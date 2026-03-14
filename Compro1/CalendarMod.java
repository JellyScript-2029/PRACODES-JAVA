

import java.util.Scanner;
public class CalendarMod{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Boolean validInput = false;
        int m = 0;
        //Check if month is valid
        System.out.print("Enter month as a number (1-12): ");
        while (!validInput) {
            if (input.hasNextInt()) {
                m = input.nextInt();
                //check month correct range
                if (m >= 1 && m <= 12) {
                    validInput = true;
                } else {
                    System.out.print("Invalid input ");
                    System.out.print("Please enter a month between 1 and 12: ");
                }
            } else {
                System.out.print("Invalid input! Please enter a integer: ");
                input.next(); // Clear the invalid input
            }
        }

        validInput = false;
        int y = 0;
        // checks if the year is valid
        System.out.print("Enter year (e.g, 2021): ");
        while (!validInput) {
            if (input.hasNextInt()) {
                y = input.nextInt();
                if (y > 1) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input! Year can not be negative");
                    System.out.print("Please enter a positive integer: ");
                }
            } else {
                System.out.print("Please enter integer: ");
                input.next();
            }
        }
        // Print calendar for the month of the year
        printMonth(m, y);
    }

    // print the month
    public static void printMonth(int m, int y) {
        printMonthTitle(m, y);
        printMonthBody(m, y);
        System.out.println("\n-------------------------------------------");
    }

    // prints month title
    public static void printMonthTitle(int m, int y) {
        String monthName = getMonthName(m);
        System.out.println("\n                " + monthName + " " + y);
        System.out.println("-------------------------------------------");
        System.out.println("  Sun   Mon    Tue  Wed   Thu    Fri   Sat");
    }

    //body of the calendar
    public static void printMonthBody(int m, int y) {

        int startDay = getStartDay(m, y);
        int daysOfTheMonth = getNumberOfDaysInMonth(m, y);

        // spacing
        for (int i = 0; i < startDay; i++) {
            System.out.print("      ");
        }

        for (int day = 1; day <= daysOfTheMonth; day++) { // Print the days
            System.out.printf("%5d ", day);
            if ((day + startDay) % 7 == 0) { // New row after Saturday
                System.out.println();
            }
        }
    }

    // month names
    public static String getMonthName(int m) {
        String monthName = "";
        switch (m) {
            case 1 ->
                monthName = "January";
            case 3 ->
                monthName = "March";
            case 5 ->
                monthName = "May";
            case 7 ->
                monthName = "July";
            case 8 ->
                monthName = "August";
            case 10 ->
                monthName = "October";
            case 12 ->
                monthName = "December";
            case 9 ->
                monthName = "September";
            case 4 ->
                monthName = "April";
            case 6 ->
                monthName = "June";
            case 11 ->
                monthName = "November";
            case 2 ->
                monthName = "February";
        }
        return monthName;

    }

    public static int getStartDay(int m, int y) {
        //13 for january and 14 for february
        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }
        //find day of the week using zeller's congruence
        int j = y / 100;
        int k = y % 100;
        int week = (1 + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return (week + 6) % 7;
    }

    //number of days in a month
    public static int getNumberOfDaysInMonth(int m, int y) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 9:
            case 4:
            case 6:
            case 11:
                return 30;
            case 2:
                return isLeapYear(y) ? 29 : 28;
            default:
                return 0;
        }
    }

    //leap year
    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}