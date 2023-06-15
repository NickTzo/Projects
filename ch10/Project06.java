package gr.aueb.cf.ch10;

public class Project06 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] localmax = new int[9];


        localmax = localmaximun(arr);
        for (int i =0; i < localmax.length; i++){
            System.out.println(localmax[i]);
        }
    }





//    public static int globalmaximun(int[]arr){
//
//    }

    public static int[] localmaximun(int[] arr){

        int max = 0;
        int[] localmax = new int[9];

        int max_so_far = Integer.MIN_VALUE ;
        int max_ending_here = 0;


        for (int i = 0; i < arr.length; i++) {
            max = max + arr[i];
            if (max_so_far < max) {
                max_so_far = max;
                localmax[i] = max;
            }else if(max_so_far < 0){
                max = 0;
            }
        }


        return localmax;
    }
}
