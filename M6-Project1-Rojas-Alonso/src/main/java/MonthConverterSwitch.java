package com.company;
// import scanner
import java.util.Scanner;

public class MonthConverterSwitch {
    public static void main(String[] args) {
        //declare scanner as myScanner
        Scanner myScanner = new Scanner(System.in);

        // prompt user to enter an number between one and twelve
        System.out.println("Enter a number between 1 and 12: ");
        String userInput = myScanner.nextLine();

        // Convert userInput into an int
        int userMonth = Integer.parseInt(userInput);
// set up the switch, make it break after each case scenario
        switch (userMonth) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.print("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                //if it doesn't work enter a warning
                System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }
    }
}
