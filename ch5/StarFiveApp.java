package gr.aueb.cf.ch5;
/**
 * προγράμματα όπου ο χρήστης θα δίνει το πλήθος
 * των stars και ενφανιζονται απο n εως 1
 */
import java.util.Scanner;

    public class StarFiveApp {public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Please provide a number of stars");
        n = scanner.nextInt();
        for(int j = 0; j <= n; j++) {
            for (int i = n; i > j; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
