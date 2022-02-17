package com.company;
import java.util.Scanner;
public class ArrayFunReverseIt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr1 = {0,0,0,0,0};

        for (int i = 4; i >= 0; i--) {

        //for (int i = 0; i < 5; i++) {
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

