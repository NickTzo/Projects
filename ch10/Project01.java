package gr.aueb.cf.ch10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

/**
 * An app that break the array in piece of 6 numbers with some parameters,
 * and it finds every possibility from the numbers
 */
public class Project01 {
    public static void main(String[] args){
       try (Scanner scanner = new Scanner(new File("C:\\Users\\Nikos\\OneDrive\\Υπολογιστής\\Notes\\Java\\Exersice in lesson\\lottoin.txt"));
            PrintStream ps = new PrintStream("C:\\Users\\Nikos\\OneDrive\\Υπολογιστής\\Notes\\Java\\Exersice in lesson\\lottoout.txt",StandardCharsets.UTF_8)){

           final int SIZE = 6;
           int[] inputNumbers = new int[49];
           int[] result = new int[6];
           int pivot = 0;
           int num;
           int window;

           while((num =scanner.nextInt()) != -1 && pivot <= 48){
               inputNumbers[pivot] = num;
               pivot++;
           }
            int[] numbers = Arrays.copyOfRange(inputNumbers, 0 , pivot);
           Arrays.sort(numbers);

           window = pivot - SIZE;
           for(int i = 0; i<= window; i++){
               for(int j = i; j <= window + 1; j++){
                   for(int k = j; k <= window + 2; k++){
                       for(int l = k; l <= window + 3; l++){
                           for(int m = l; m <= window + 4; m++){
                               for(int n = m; n <= window + 5; n++){
                                   result[0] = numbers[i];
                                   result[1] = numbers[j];
                                   result[2] = numbers[k];
                                   result[3] = numbers[l];
                                   result[4] = numbers[m];
                                   result[5] = numbers[n];

                                   if(isEven(result, 4) && isOdd(result, 4) && isContiguous(result, 2) && isSameEnding(result, 3) &&
                                           isSameTen(result, 3)) {
                                       ps.printf("%d %d %d %d %d %d\n", result[0], result[1], result[2], result[3], result[4],result[5]);
                                   }
                               }
                           }
                       }
                   }
               }
           }

       }catch (IOException e) {
           e.printStackTrace();
       }
    }

    /**
     * if the numbers are even
     * @param arr the array that the user give
     * @param threshold the parameters
     * @return  the array after we check the parameters
     */
    public static boolean isEven(int[] arr,int threshold){
        int count = 0;
        boolean even = false;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        if(count < threshold){
            even = true;
        }
        return even;
    }

    /**
     * if the numbers are odd
     * @param arr the array that the user give
     * @param threshold the parameters
     * @return  the array after we check the parameters
     */

    public static boolean isOdd(int[] arr,int threshold){
        int count = 0;
        boolean odd = false;
        for (int i : arr) {
            if (i % 2 != 0) {
                count++;
            }
        }
        if(count < threshold){
            odd = true;
        }
        return odd;
    }

    /**
     * if the numbers are continues
     * @param arr the array that the user give
     * @param threshold the parameters
     * @return  the array after we check the parameters
     */

    public static boolean isContiguous(int[] arr,int threshold){
        int count = 0;
        boolean cont = false;
        for(int i = 0 , j = i+1; i <= arr.length-1; i++){
                if(arr[i] == arr[j]){
                    count++;
            }
        }
        if(count < threshold){
            cont = true;
        }
        return cont;
    }

    /**
     * if the numbers have the same ending
     * @param arr the array that the user give
     * @param threshold the parameters
     * @return  the array after we check the parameters
     */

    public static boolean isSameEnding(int[] arr,int threshold){
        int count = 0;
        boolean sameEnd = false;
        for(int i = 0; i <= arr.length; i++){
            for (int j = i; j <= arr.length-1; j++){
                if((arr[i] % 10) == (arr[j] % 10)){
                    count++;
                }
            }
        }
        if(count < threshold){
            sameEnd =  true;
        }
        return sameEnd;
    }

    /**
     * if we have numbers with the same ending in every ten numbers
     * @param arr the array that the user give
     * @param threshold the parameters
     * @return  the array after we check the parameters
     */

    public static boolean isSameTen(int[] arr,int threshold){
        int count = 0;
        boolean sameTen = false;
        for(int i = 0, j = i + 1; i <= arr.length-1; i++){
                if((arr[i] / 10) == (arr[j] / 10)){
                    count++;
            }
        }
        if(count < threshold){
            sameTen =  true;
        }
        return sameTen;
    }
}

