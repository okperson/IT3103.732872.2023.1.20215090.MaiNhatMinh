package lab01;

import java.util.Scanner;

public class Bai6_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for month
        String inputMonth;
        do {
            System.out.print("Nhap thang: ");
            inputMonth = scanner.nextLine().toLowerCase();
        } while (!isValidMonth(inputMonth));

        // Prompt for year
        int inputYear;
        do {
            System.out.print("Nhap nam: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Nam khong hop le. Vui long nhap lai");
                scanner.next();
            }
            inputYear = scanner.nextInt();
        } while (inputYear < 0);

        scanner.close();

        // Read the number of days in the month from the entered month and year
        int daysInMonth = getDaysInMonth(inputMonth, inputYear);

        // Display the result
        System.out.println("So ngay trong thang " + inputMonth + " " + inputYear + ": " + daysInMonth + " ngay");
    }

    // Function to check if the entered month is valid or not
    private static boolean isValidMonth(String month) {
        String[] validMonths = {"january", "jan.", "jan", "1", "february", "feb.", "feb", "2", "march", "mar.", "mar", "3",
                "april", "apr.", "apr", "4", "may", "5", "june", "jun", "6", "july", "jul", "7", "august", "aug.", "aug",
                "8", "september", "sep.", "sep", "9", "october", "oct.", "oct", "10", "november", "nov.", "nov", "11",
                "december", "dec.", "dec", "12"};

        for (String validMonth : validMonths) {
            if (month.equals(validMonth)) {
                return true;
            }
        }

        System.out.println("Thang khong hop le. Vui long nhap lai.");
        return false;
    }

    // Function to get the number of days in a month for a given year
    private static int getDaysInMonth(String month, int year) {
        switch (month) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
            case "march":
            case "mar.":
            case "mar":
            case "3":
            case "may":
            case "5":
            case "july":
            case "jul":
            case "7":
            case "august":
            case "aug.":
            case "aug":
            case "8":
            case "october":
            case "oct.":
            case "oct":
            case "10":
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 31;
            case "april":
            case "apr.":
            case "apr":
            case "4":
            case "june":
            case "jun":
            case "6":
            case "september":
            case "sep.":
            case "sep":
            case "9":
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 30;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; // Invalid input for month
        }
    }

    // Function to check if the entered year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
