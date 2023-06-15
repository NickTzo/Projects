package gr.aueb.cf.ch1;
import java.util.Scanner;

public class SelectApp {
    public static void main(String[] args) {
        int num;
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a number between 1-5");
        num = scanner.nextInt();
            do {
                System.out.println("1.Εισαγωγή");
                System.out.println("2.Διαγραφή");
                System.out.println("3.Ενημέρωση");
                System.out.println("4.Αναζήτηση");
                System.out.println("5.Έξοδος");
                if(num == 1){
                    System.out.println("Επιλέξατε Εισαγωγή");
                    num = scanner.nextInt();
                }if(num == 2){
                    System.out.println("Επιλέξατε Διαγραφή");
                    num = scanner.nextInt();
                }if(num == 3){
                    System.out.println("Επιλέξατε Ενημέρωση");
                    num = scanner.nextInt();
                }if(num == 4){
                    System.out.println("Επιλέξατε Αναζήτηση");
                    num = scanner.nextInt();
                }if(num == 5){
                    System.out.println("Επιλέξατε Έξοδος");
                    exit=true;
                }else {
                    System.out.println("Give a number from the options");
                    num = scanner.nextInt();
                }
            }while (!exit);{
            System.out.println("Bye");
        }

    }
}