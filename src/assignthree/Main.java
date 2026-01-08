//Arrays and Strings - Advance Assignment
package assignthree;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // Problem 1  1: Longest Consecutive Sequence
    //Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
    static void longSubSeq(int[] arr1 , Integer length1){
        Arrays.sort(arr1);
        int max = 0;
        int count = 0;
        int consecutive = arr1[0];
        for(int i=1 ; i< length1 ;i++){
            if(arr1[i] == consecutive +1){
                count++;
                consecutive++;
            }
            else{
                if(count > max){
                    max = count;
                }
                count = 1;
                consecutive = arr1[i];
            }

        }
        System.out.println(max);
    }

    //-------------------Problem 1 over-----------------------




    //----- Problem 2- Rotate Matrix by 90 Degrees ----
    //Given an N x N matrix, rotate it by 90 degrees clockwise in-place without using any extra matrix.

    static void rotateninty(int[][] arr2 , Integer N){
        int[][] rotated = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0; j<N;j++){
                rotated[j][N-1-i] = arr2[i][j];
            }
        }
        System.out.println("Rotated Matrix is : ");
        for(int i=0;i<N;i++){
            for(int j=0; j<N;j++){
                arr2[i][j]= rotated[i][j];
                System.out.print(""+arr2[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    //---------------------Problem 2 over ---------------------------------






    //--------- Problem 3 - First Non-Repeating Character ---------------
    //    //Given a string, find the first non-repeating character. If none exists, print -1.
    static char nonRepeatChar(String string3){
        int length3 = string3.length();
        for(int i= 0; i<length3 ; i++){
            char first = string3.charAt(i);
            boolean repeat = false ;
            for(int j=0; j<length3 ;j++){
                if(i != j && first == string3.charAt(j)){
                    repeat = true;
                    break;
                }
            }
            if(repeat){
                return first;
            }
        }
        return '-';
    }


    //---------------------Problem 3 over ---------------------------------




    //--------- Problem  4:

    //---------------------Problem 4 over ---------------------------------







    //--------- Problem  5: Row-wise Sum of Matrix - Find sum of each row in a matrix ----------------

    //---------------------Problem 5 over ---------------------------------




    //--------- Problem   6: Palindrome String - Check whether the given string is a palindrome. ----------------


    //---------------------Problem 6 over ---------------------------------








    //--------- Problem   7: Count Vowels - Count number of vowels in the given string. ----------------


    //---------------------Problem 7 over ---------------------------------








    //--------- Problem  8 Character Frequency - Count frequency of a given character in a string.----------------


    //---------------------Problem 8 over ---------------------------------








    //--------- Problem   9: Longest Word - Find the longest word in a sentence.  ----------------


    //---------------------Problem 9 over ---------------------------------








    //--------- Problem  10: Names Starting with Character - Count names starting with a given character. ----------------



    //---------------------Problem 10 over ---------------------------------

















    // Main for the Third Assignment 7th Jan 2026
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //--------- Problem 1 of the Assignment on 7th Jan 2026----------------
        System.out.println("Enter the no of elements of Array :");
        int length1 = scanner.nextInt();
        System.out.println("Enter elements of the array: ");
        int[] arr1 = new int[length1];
        for(int i=0; i<length1; i++) arr1[i]= scanner.nextInt();

        longSubSeq(arr1,length1);

        //---------------------Problem 1 over ---------------------------------




        //--------- Problem 2 of the Assignment on 7th Jan 2026----------------
        System.out.println("Enter The number of rows for a  N x N matrix :");
        int N = scanner.nextInt();
        int[][] arr2= new int[N][N];
        System.out.println("Enter The elements of matrix :");
        for(int i=0; i<N ; i++){
            for(int j=0; j<N; j++){
                arr2[i][j]= scanner.nextInt();
                System.out.println("\t");
            }
            System.out.println("\n");
        }
        rotateninty(arr2,N);
        //---------------------Problem 2 over ---------------------------------




        //--------- Problem 3 of the Assignment on 7th Jan 2026----------------

        //---------------------Problem 3 over ---------------------------------




        //--------- Problem 4 of the Assignment on 7th Jan 2026----------------

        //---------------------Problem 4 over ---------------------------------



        //--------- Problem 5 of the Assignment on 7th Jan 2026----------------

        //---------------------Problem 5 over ---------------------------------







        //--------- Problem 6 of the Assignment on 7th Jan 2026----------------

        //---------------------Problem 6 over ---------------------------------







        //--------- Problem 7 of the Assignment on 7th Jan 2026----------------

        //---------------------Problem 7 over ---------------------------------








        //--------- Problem 8 of the Assignment on 7th Jan 2026----------------

        //---------------------Problem 8 over ---------------------------------







        //--------- Problem 9 of the Assignment on 7th Jan 2026----------------

        //---------------------Problem 9 over ---------------------------------








        //--------- Problem 10 of the Assignment on 7th Jan 2026----------------

        //---------------------Problem 10 over ---------------------------------




    }
}