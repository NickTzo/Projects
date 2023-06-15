package gr.aueb.cf.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * An app tha the user can book/cancel a seat in theater
 */
public class Project10 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean[][] reservation = new boolean[30][12];
        int row;
        char column;
        int columnInt;
        boolean choice = false;
        boolean booking = false;
        boolean cancelling = false;
        String answer;
        open(reservation);
        do {
            try {
                do {
                    System.out.println("You want to do a booking (b) or cancellation (c) or to Quit (q)?");
                    answer = scanner.nextLine();
                    answer = answer.toLowerCase();
                    if (answer.matches("b")) {
                        booking = true;
                    } else if (answer.matches("c")) {
                        cancelling = true;
                    }else if(answer.matches("q")){
                        choice = true;
                        break;
                    }
                } while (!(booking || cancelling));
                if(!choice){
                    System.out.println("Please give me the row tha you want to seat between 1 - 30");
                    row = scanner.nextInt();
                    if (row < 0 || row > 31) {
                        do {
                            System.out.println("Please give a correct row");
                            row = scanner.nextInt();
                        } while (row < 0 || row > 31);
                    }

                    System.out.println("Please give a column that you want to seat between A - L");
                    column = scanner.next().charAt(0);
                    column = Character.toLowerCase(column);
                    columnInt = column;
                    if (columnInt < 97 || columnInt > 108) {
                        do {
                            System.out.println("Please give a correct column");
                            column = scanner.next().charAt(0);
                            column = Character.toLowerCase(column);
                            columnInt = column;
                        } while (columnInt < 97 || columnInt > 108);
                    }

                    if (booking) {
                        book(column, row, reservation);
                        booking = false;
                    }
                    if(cancelling){
                        cancel(columnInt, row, reservation);
                        cancelling = false;
                    }
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Please give a correct choice");
            }
        } while (!choice);{
            System.out.println("See you soon");
        }
    }

    /**
     *                           the initialization of the array
     * @param reservation       the array
     * @return                   returns the array
     */


    public static boolean[][] open(boolean[][] reservation) {
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 12; j++) {
                reservation[i][j] = false;
            }
        }
        return reservation;
    }

    /**
     *
     * @param columnInt    the column tha the user want to book in an integer
     * @param row          the row that the user want to book
     * @param reservation  the array of the reservations
     * @return             returns the booking tha the user have done in the array
     */

    public static boolean[][] book(int columnInt,int row, boolean[][] reservation){

        if (reservation[row][columnInt - 86]) {
            System.out.println("The seat is already booked.Please choose another seat");
        } else {
            reservation[row][columnInt - 86] = true;
            System.out.println("The seat has booked");
        }
        return reservation;
    }

    /**
     *
     * @param columnInt           the column tha the user want to book in an integer
     *      * @param row          the row that the user want to book
     *      * @param reservation  the array of the reservations
     * @return                    returns the cancellation of the booking in the array
     */
    public static boolean[][] cancel ( int columnInt, int row, boolean[][] reservation){
        if (reservation[row][columnInt - 86]) {
            reservation[row][columnInt - 86] = false;
            System.out.println("The cancellation has done");
        } else {
            System.out.println("The seat isn't booked.Please choose another seat");
        }
        return reservation;
    }
}
