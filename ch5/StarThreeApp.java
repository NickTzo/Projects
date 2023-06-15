package gr.aueb.cf.ch5;
/**
 * προγράμματα όπου ο χρήστης θα δίνει το πλήθος
 * των stars και ενφανιζονται σε  n*n
 */

import java.util.Scanner;

public class StarThreeApp {public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Please provide a number of stars");
        n = scanner.nextInt();
        for(int j = 1; j <= n; j++){
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
