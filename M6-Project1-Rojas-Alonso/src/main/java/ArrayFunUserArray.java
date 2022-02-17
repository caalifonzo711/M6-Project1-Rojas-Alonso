package com.company;
import java.util.Scanner;
//provide code that reads five integers from the user
//puts them into an array
//prints array elements into screen
public class ArrayFunUserArray {

    public static void main(String[] args) {
        //declare scanner
        Scanner scanner = new Scanner(System.in);

        //set up int array called arr1, make it five units long
        int[] arr1 = {0,0,0,0,0};

        // set up for loop, int i starts at 0; i ends at 5; loop through +1
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            int num = Integer.parseInt(scanner.nextLine());
            arr1[i] = num;
        }
        for (int i: arr1) {
            System.out.println(i);
        }



// array called my array and itll have five spaces and each one will be my array bracket one
// if you know the length of the array you can go backwards, use i-- instead of i++
        //start at the max


    }
}
