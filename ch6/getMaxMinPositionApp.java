package gr.aueb.cf.ch6;

/**
 * Ενα App οπου ο παρέχεται στο πρόγραμμα ενας πίνακας
 * και βρίσκει τη θέση του μεγαλύτερου στοιχείου και το  δεύτερο μικρότερο νούμερο απο τους αριθμούς
 */

public class getMaxMinPositionApp {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 9, -1, 8, 120, 5};

        /* Το high δηλώνει το μεγαλύτερο αριθμό απο το πίνακα
         * το highPosition δηλώνει τη θέση του μέγιστου στοιχείου
         * το low  δηλώνει το  μικρότερο αριθμό απο το πίνακα
         * το secondLow δηλωνει το δευτερο μικροτερο σοιχείο του πίνακα
         */

        int high = arr[0];
        int highPosition = arr[0];
        int low = arr[0];
        int secondLow = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (highPosition < arr[i]) {
                highPosition = i;
                high = arr[i];
                }
            if(low > arr[i]){
                secondLow = low;
                low = arr[i];
            }
        }
        if(high == low){
            System.out.printf("The Max and the Min is Equal:%d", high);
        }else{
            System.out.printf("Max value is in position: %d of the table and the Second Min value is:%d", highPosition + 1 ,secondLow);
        }
    }
}
