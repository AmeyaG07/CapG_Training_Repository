package assigntwo;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // Problem 1 Find Out the Min Max Element of an Array with N elements
    static void minmax(Integer length1 , int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i<length1; i++){
            if(arr[i] > max ) max = arr[i];
            if(arr[i] < min ) min = arr[i];
        }
        System.out.println("Min : " +min+ "Max : " + max +"\n");
    }
    //-------------------Problem 1 over-----------------------




    //----- Problem 2- Array Left Rotation  - Rotate the array to the left by D positions --------
    static void leftRotate(Integer length2 , int[] array, Integer d){
        d = d % length2;
        for(int j=0; j<d; j++) {
            int first = array[0];
            for(int k=0; k<length2-1; k++) {
                array[k] = array[k+1];
            }
            array[length2-1] = first;
        }
    }
    //---------------------Problem 2 over ---------------------------------






    //--------- Problem 3 - Count Even and Odd Count number of even and odd elements in the array.--------------
    static void countEvenOdd(int[] arr3, Integer length3){
        int even=0,odd=0;
        for(int i =0 ; i<length3 ; i++){
            if(arr3[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("EvenCount: "+even+"\n OddCount: "+odd+"\n");
    }


    //---------------------Problem 3 over ---------------------------------




    //--------- Problem  4: Second Largest Element - Find the second largest element in the array. ----------------
    static void secondLargest(int[] arr4, Integer length4){
        if(length4 < 2) {
            System.out.println("Need ≥2 elements");
            return;
        }
        int max = arr4[0];
        for(int i=0; i<length4; i++){
            if(arr4[i] > max) max = arr4[i];
        }
        int max2 = Integer.MIN_VALUE;
        for(int j=0; j<length4; j++){
            if(arr4[j] > max2 && arr4[j] < max) max2 = arr4[j];
        }
        System.out.println("Second Largest Element is : "+max2+"\n");
    }

    //---------------------Problem 4 over ---------------------------------







    //--------- Problem  5: Row-wise Sum of Matrix - Find sum of each row in a matrix ----------------
    static void sumRows(int[][] arr5, Integer rows1, Integer columns1){

        for(int i=0; i<rows1 ; i++){
            int sum = 0;
            for(int j=0; j<columns1; j++){
                sum += arr5[i][j];
            }
            System.out.println(sum);
        }

    }
    //---------------------Problem 5 over ---------------------------------




    //--------- Problem   6: Palindrome String - Check whether the given string is a palindrome. ----------------
    static void palindromeString(String string1){
        int length6 = string1.length();
        boolean palindrome = true;
        for(int i=0; i<length6/2; i++){
            if(string1.charAt(i) != string1.charAt(length6-1-i)){
                palindrome = false;
                break;  // Exit early if false
            }
        }
        if(palindrome){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }
    }


    //---------------------Problem 6 over ---------------------------------








    //--------- Problem   7: Count Vowels - Count number of vowels in the given string. ----------------


    //---------------------Problem 7 over ---------------------------------








    //--------- Problem  8 Character Frequency - Count frequency of a given character in a string.----------------


    //---------------------Problem 8 over ---------------------------------








    //--------- Problem   9: Longest Word - Find the longest word in a sentence.  ----------------


    //---------------------Problem 9 over ---------------------------------








    //--------- Problem  10: Names Starting with Character - Count names starting with a given character. ----------------


    //---------------------Problem 10 over ---------------------------------

















    // Main for the Second Assignment 7th Jan 2026
    public static void main(String[] args) {



        //--------- Problem 1 of the Assignment on 6th Jan 2026----------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of elements: ");
        int length1 = scanner.nextInt();
        int[] arr = new int[length1];
        System.out.println("Enter " + length1 + " elements:");
        for (int i = 0; i <= length1; i++) {
            arr[i] = scanner.nextInt();
        }

        minmax(length1, arr);
        //---------------------Problem 1 over ---------------------------------




        //--------- Problem 2 of the Assignment on 6th Jan 2026----------------
        System.out.println("Enter Number of elements: ");
        int length2 = scanner.nextInt();
        int[] array = new int[length2];
        System.out.println("Enter " + length2 + " elements:");
        for (int i = 0; i <= length2; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter Number of Shifts to be performed : ");
        int d = scanner.nextInt();

        leftRotate(length2,array,d);
        //---------------------Problem 2 over ---------------------------------




        //--------- Problem 3 of the Assignment on 6th Jan 2026----------------
        System.out.println("Enter Number of elements: ");
        int length3 = scanner.nextInt();
        int[] arr3 = new int[length3];
        System.out.println("Enter " + length3 + " elements:");
        for (int i = 0; i <= length3; i++) {
            arr3[i] = scanner.nextInt();
        }
        countEvenOdd(arr3,length3);
        //---------------------Problem 3 over ---------------------------------




        //--------- Problem 4 of the Assignment on 6th Jan 2026----------------
        System.out.println("Enter Number of elements: ");
        int length4 = scanner.nextInt();
        int[] arr4 = new int[length4];
        System.out.println("Enter " + length4 + " elements:");
        for (int i = 0; i <= length4; i++) {
            arr4[i] = scanner.nextInt();
        }
        secondLargest(arr4,length4);
        //---------------------Problem 4 over ---------------------------------



        //--------- Problem 5 of the Assignment on 6th Jan 2026----------------
        System.out.println("Enter The number od rows and Columns :");
        int rows1 = scanner.nextInt();
        int columns1 = scanner.nextInt();
        int[][] arr5= new int[rows1][columns1];
        System.out.println("Enter The elements of matrix :");
        for(int i=0; i<rows1 ; i++){
            for(int j=0; j<columns1; j++){
               arr5[i][j]= scanner.nextInt();
               System.out.println("\t");
            }
            System.out.println("\n");
        }
        sumRows(arr5,rows1,columns1);

        //---------------------Problem 5 over ---------------------------------







        //--------- Problem 6 of the Assignment on 6th Jan 2026----------------
        System.out.println("Enter a String: ");
        String string1 = scanner.nextLine();
        palindromeString(string1);
        //---------------------Problem 6 over ---------------------------------







        //--------- Problem 7 of the Assignment on 6th Jan 2026----------------

        //---------------------Problem 7 over ---------------------------------








        //--------- Problem 8 of the Assignment on 6th Jan 2026----------------

        //---------------------Problem 8 over ---------------------------------







        //--------- Problem 9 of the Assignment on 6th Jan 2026----------------

        //---------------------Problem 9 over ---------------------------------








        //--------- Problem 10 of the Assignment on 6th Jan 2026----------------

        //---------------------Problem 10 over ---------------------------------




    }
}