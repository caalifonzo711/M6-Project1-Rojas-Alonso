package com.company;
// import the scanner
import java.util.Scanner;
public class ArrayFun5Words {
    public static void main(String[] args) {
        //declare scanner
        Scanner scanner = new Scanner(System.in);

        // string array
        String[] arr1 = {"word1", "word2", "word3", "word4", "word5"};

        // set up for loop, start i at 0; make i go through the whole length; i++ roll all throughout
        for (int i = 0; i < arr1.length; i++) {

            //prompt user to enter a word
            System.out.println("enter a word: ");
            String word = scanner.nextLine();
            arr1[i] = word;
        }
        for (String i: arr1) {
            System.out.println(i);
        }

    }
}
