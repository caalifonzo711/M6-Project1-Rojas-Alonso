package com.company;

import java.util.Scanner;

public class MonthConverterIf {


    public static void main(String[] args) {

        //import the scanner
        Scanner myScanner = new Scanner
                (System.in);

        //Promt user for input
        System.out.println(("Enter a number between 1 and 12:"));
        String userInput = myScanner.nextLine();

        // convert input to number

        int userMonth = Integer.parseInt(userInput);


        // compare userMonth to numbers between 1 and 12 and print the right month and print out the right day
// set up if/ else if
        if (userMonth == 1){
            System.out.println("Jan");
        }else if (userMonth == 2){
            System.out.println("Feb");
        }else if (userMonth == 3){
            System.out.println("Mar");
        }else if (userMonth == 4){
            System.out.println("Apr");
        }else if (userMonth == 5) {
            System.out.println("May");
        }else if (userMonth == 6) {
            System.out.println("Jun");
        }else if (userMonth == 7) {
            System.out.println("Jul");
        }else if (userMonth == 8) {
            System.out.println("Aug");
        }else if (userMonth == 9) {
            System.out.println("Sep");
        }else if (userMonth == 10) {
            System.out.println("Oct");
        }else if (userMonth == 11) {
            System.out.println("Nov");
        }else if (userMonth == 12) {
            System.out.println("Dec");
        } else {
            // if number is invalid print out a warning
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye.");
        }




    }
}
