package gr.aueb.cf.ch10;

public class Project05 {
    public static void main(String[] args) {
        int[] arr = {0,1,4,4,4,6,7,8,8,8,8,8};
        final int KEY = 8;
        arr = getLowAndHighIndexOf(arr,KEY);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] getLowAndHighIndexOf(int[] arr, int key){
        int low = 0;
        int high;
        int pivot;
        int count = 0;

        if(arr == null) return new int[] {};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                low = i;
                count++;
                break;
            }
        }
        high = low;
        pivot = low + 1;
        while (pivot < arr.length && arr[pivot++] == key){
            count++;
            high++;
        }

        return new int[]{low,high,count};
    }
}
