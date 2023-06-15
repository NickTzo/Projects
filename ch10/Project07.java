package gr.aueb.cf.ch10;

import java.util.Arrays;

/**
 * An app that shows the difference between the deep and the shallow array
 */
public class Project07 {
    public static void main(String[] args) {
        int[][] arr = {{ 1, 1 }, { 1, 1 }};
        int[][] arr2;
        int[][] arr3 = {{ 3, 3 }, { 3, 3 }};
        int[][] arr4;


        System.out.println("Deep Copy");

        arr2 = deepCopy(arr);
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr2[i][j] = 2;
                System.out.println(arr2[i][j]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        System.out.println("Shallow Copy");

        arr4 = shallowCopy(arr3);
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr4[i][j] = 4;
                System.out.println(arr4[i][j]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr3[i][j]);
            }
        }



    }

    /**
     * the deep copy does copy of the elements from the original array
     * @param arr the array that we want to copy
     * @return    returnees the copies of the elements so the arr3 now its independent array
     */

    public static int[][] deepCopy(int[][] arr){
        int[][] arr3 = new int[2][2];
        for(int i = 0; i < arr3.length; i++){
            for (int j = 0; j < arr3.length; j++){
                arr3[i][j] = arr[i][j];
            }
        }
        return arr3;
    }

    /**
     * the difference is tha the shallow copies returns the reference
     * @param arr3 the array that we want to copy
     * @return   the reference if we change something in the copied array we change it also in the original
     */
    public static int[][] shallowCopy(int[][] arr3){
        int[][] arr4;
        arr4 = arr3;
        return arr4;
    }
}
