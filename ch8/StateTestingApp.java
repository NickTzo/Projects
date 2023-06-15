package gr.aueb.cf.ch8;

import java.util.Scanner;

public class StateTestingApp {
    public static void main(String[] args) throws IllegalArgumentException {
        int choice=-1;
        do{
            try {
                System.out.println("Επιλέξτε απο τις παρακάτω επιλογές:");
                System.out.println("1.Εισαγωγή");
                System.out.println("2.Διαγραφή");
                System.out.println("3.Αναζήτηση:");
                System.out.println("4.Ενημέρωση:");
                System.out.println("5.Έξοδος:");
                System.out.println("Δώστε αριθμό επιλογής:");

                    choice = getChoice(choice);
                    printChoice(choice);

            }catch (IllegalArgumentException e){
                System.out.println("Please give a valid choice");
            }
        }while (choice != 5);
        System.out.println("BYE");
    }


    public static void printChoice(int choice) throws IllegalArgumentException  {
            if(choice > 0 && choice < 6){
                    if(choice == 1){
                        System.out.println("1.Επιλέξατε Εισαγωγή");
                    }
                    if(choice == 2){
                        System.out.println("2.Επιλέξατε Διαγραφή");
                    }
                    if(choice == 3){
                        System.out.println("3.Επιλέξατε Ενημέρωση");
                    }
                    if(choice == 4){
                        System.out.println("4.Επιλέξατε Αναζήτηση");
                    }
                    if(choice == 5){
                        System.out.println("5.Επιλέξατε Έξοδος");
                    }
            }else {
                throw new IllegalArgumentException();
            }
    }


    public static int getChoice(int choice){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                break;
            } else {
                System.out.println("Please give a correct integer");
                scanner.nextLine();
            }
        }
        return choice;
    }
}

