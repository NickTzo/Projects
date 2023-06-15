package gr.aueb.cf.ch10;

import java.io.*;
import java.util.Arrays;

/**
 * Δεν την καταφερα να την τελειωσω οπως θα ερπεπε
 *
 * An app tha reads a text and give as the frequency of each letter
 */

public class Project03 {
    public static void main(String[] args) {
        char[][] arr = new char[256][2];
        String charr;
        int move;
        int[] count = new int[256];
        try(BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Nikos\\OneDrive\\Υπολογιστής\\Notes\\Java\\Exersice in lesson\\lottoin.txt"))){
             while ((charr = bf.readLine()) != null) {
                 for(int i = 0; i < charr.length(); i++){
                     char ch = charr.charAt(i);
                     arr[i][0] = ch;
                     if (!exists(arr, ch)) {
                         arr[i][0] = ch;
                         count[i]++;
                         arr[i][1] = (char)count[i];
                     }else{
                        move = count[pivot(arr,ch)] + 1;
                        arr[pivot(arr,ch)][1] = (char) move;
                     }

                 }
             }
//            for(int i = 0; i < arr.length; i++){
//                Arrays.sort(arr[i]);
//                System.out.println(arr[i][1]);
//            }
             for(int i = 0; i < arr.length; i++){
                 double num = (double) arr[i][0] / arr.length;
                 System.out.println("Το char: " + arr[i][0] + " ενφανιστηκε " + (int)arr[i][1] + " φορες με συχνοτητα: "+ num + "%" );
             }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Checks the array if the char exists
     * @param arr the array that has the chars from the text
     * @param ch  each car from the array
     * @return   retardants an array that has one from each cahr
     */

    public static boolean exists(char[][] arr, char ch){
        boolean is = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == ch) {
                is = true;
                break;
            }
        }
        return is;
    }

    /**
     * Keeps how many different chars we have in the text
     * @param arr the array tha has all the chars from the text
     * @param ch  its char from the text
     * @return   the numbers of the different char
     */
    public static int pivot(char[][] arr, char ch){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == ch) {
                temp = i;
            }
        }
        return temp;
    }
}
