package gr.aueb.cf.ch5;
/**
 * προγράμματα όπου ο χρήστης θα δίνει το πλήθος
 * των stars και ενφανιζονται σε  κάθετα αστεράκια
 */

import java.util.Scanner;

public class StarTwoApp {public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Please provide a number of stars");
        n = scanner.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println("*");
        }
    }
}
