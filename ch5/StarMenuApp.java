package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Είναι ενα πρόργαμμα όπου ο χρήστης αφού πάρει ενα μενού
 * μπορεί και δίνει αριθμό για την αντοίστιχη κατηγορία που θέλει να βρεθεί και
 * ξαναδίνει για να πάρει το ανάλογο αποτέλεσμα
 * αυτο συμβαίνει μέχρι ο χρήστης δώσει τον αριθμό 6
 */
public class StarMenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            menu();
            System.out.println("Please choose a number");
            n = scanner.nextInt();
            if(n < 1 || n > 6){
                System.out.println("Please give a correct choice");
            }else {
                switch (n){
                    case 1:
                        menu1();
                        break;
                    case 2:
                        menu2();
                        break;
                    case 3:
                        menu3();
                        break;
                    case 4:
                        menu4();
                        break;
                    case 5:
                        menu5();
                        break;
                    case 6:
                        menu6();
                        break;
                }
            }

        }while (n != 6);
        System.out.println("Bye");
    }

    /**
     * Είναι το πρόγραμμα που ο χρήστης θα πάρει προκειμένου
     * να δώσει την επιλογή που θέλει
     */
    public static void menu(){
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    /**
     * Αφού ο χρήστης δώσει n αριθμό απο αστεράκια
     * το πρόγραμμα θα του τα απεικονίσει σε οριζόντια διάταξη
     */
    public static void menu1(){
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Please provide a number of stars");
        n = scanner.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Αφού ο χρήστης δώσει n αριθμό απο αστεράκια
     * το πρόγραμμα θα του τα απεικονίσει σε κάθετη διάταξη
     */
    public static void menu2(){
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Please provide a number of stars");
        n = scanner.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println("*");
        }
    }

    /**
     * Αφού ο χρήστης δώσει n αριθμό απο αστεράκια
     * το πρόγραμμα θα του τα απεικονίσει σε nxn διάταξη
     */
    public static void menu3(){
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

    /**
     * Αφού ο χρήστης δώσει n αριθμό απο αστεράκια
     * το πρόγραμμα θα του τα απεικονίσει απο 1 εως n διάταξη
     */
    public static void menu4(){
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Please provide a number of stars");
        n = scanner.nextInt();
        for(int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Αφού ο χρήστης δώσει n αριθμό απο αστεράκια
     * το πρόγραμμα θα του τα απεικονίσει απο n εως 1 διάταξη
     */
    public static void menu5(){
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

    /**
     * Εφόσον ο χρήστης δώσει τον αριθμο 6 τότε θα τερματήσει το πρόγραμμα
     */
    public static void menu6(){
        System.out.println("Επιλέξατε έξοδο απο το πρόγραμμα");
    }
}
