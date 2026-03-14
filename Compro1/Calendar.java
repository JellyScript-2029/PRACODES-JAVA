

import java.util.Scanner;
public class Calendar{
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

        int daysOfTheMonth = 0;
        String month = "";
        switch (m) {
            //31 days a month
            case 1:
                daysOfTheMonth = 31;
                month = "January";
                break;
            case 3:
                daysOfTheMonth = 31;
                month = "March";
                break;
            case 5:
                daysOfTheMonth = 31;
                month = "May";
                break;
            case 7:
                daysOfTheMonth = 31;
                month = "July";
                break;
            case 8:
                daysOfTheMonth = 31;
                month = "August";
                break;
            case 10:
                daysOfTheMonth = 31;
                month = "October";
                break;
            case 12:
                daysOfTheMonth = 31;
                month = "December";
                break;
            //30 days a month
            case 9:
                daysOfTheMonth = 30;
                month = "September";
                break;
            case 4:
                daysOfTheMonth = 30;
                month = "April";
                break;
            case 6:
                daysOfTheMonth = 30;
                month = "June";
                break;
            case 11:
                daysOfTheMonth = 30;
                month = "November";
                break;
            //leap year
            case 2:
                month = "February";
                if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                    daysOfTheMonth = 29;
                } else {
                    daysOfTheMonth = 28;
                }
                break;
        }

        System.out.println("\n      " + month + " " + y);
        System.out.println("----------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // january counts as 13 and february is 14
        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }

        //find day of the week using zeller's congruence
        int j = y / 100;
        int k = y % 100;
        int week = (1 + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        int startDay = (week + 6) % 7; // turn sunday to 0 and turn saturday to 6

        for (int i = 0; i < startDay; i++) { // Spacing
            System.out.print("    ");
        }
        for (int day = 1; day <= daysOfTheMonth; day++) { //printt the days
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) { // rows
                System.out.println();
            }
        }
    }
}


