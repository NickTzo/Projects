package gr.aueb.cf.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A simple game:X's and O's  between 2 players
 * the players can play with the number keyboard pad with numbers 1 - 9 and after each
 * turn they can see there move in the console. if they want to exit they press 0.
 */

public class Project08 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] temp = new int[3][3];
        int choice = -1;
        int player = 1;
        do{
            for(int i = 0,j = 1; i < arr.length; j++,i++){
                try{
                    if(player % 2 != 0){
                        System.out.println("Player 1 can play");
                    }else{
                        System.out.println("Player 2 can play");
                    }
                    choice = scanner.nextInt();
                    if((choice < 1) || (choice > 9)){
                        if(choice == 0) {
                            break;
                        }else {
                            System.out.println("Give a correct int");
                        }
                    }else if(exist(temp,choice)){
                        System.out.println(" ");
                        System.out.println("This place is already played");
                        break;
                    }else {
                        switch (choice){
                            case 1:
                                temp[2][0] = choice;
                                if(player % 2 != 0){
                                    choice = 120;
                                }else {
                                    choice = 111;
                                }
                                arr[2][0] = choice;
                                player++;
                                break;
                            case 2:
                                temp[2][1] = choice;
                                if(player % 2 != 0){
                                    choice = 120;
                                }else {
                                    choice = 111;
                                }
                                arr[2][1] = choice;
                                player++;
                                break;
                            case 3:
                                temp[2][2] = choice;
                                if(player % 2 != 0){
                                    choice = 120;
                                }else {
                                    choice = 111;
                                }
                                arr[2][2] = choice;
                                player++;
                                break;
                            case 4:
                                temp[1][0] = choice;
                                if(player % 2 != 0){
                                    choice = 120;
                                }else {
                                    choice = 111;
                                }
                                arr[1][0] = choice;
                                player++;
                                break;
                            case 5:
                                temp[1][1] = choice;
                                if(player % 2 != 0){
                                    choice = 120;
                                }else {
                                    choice = 111;
                                }
                                arr[1][1] = choice;
                                player++;
                                break;
                            case 6:
                                temp[1][2] = choice;
                                if(player % 2 != 0){
                                    choice = 120;
                                }else {
                                    choice = 111;
                                }
                                arr[1][2] = choice;
                                player++;
                                break;
                            case 7:
                                temp[0][0] = choice;
                                if(player % 2 != 0){
                                    choice = 120;
                                }else {
                                    choice = 111;
                                }
                                arr[0][0] = choice;
                                player++;
                                break;
                            case 8:
                                temp[0][1] = choice;
                                if(player % 2 != 0){
                                    choice = 120;
                                }else {
                                    choice = 111;
                                }
                                arr[0][1] = choice;
                                player++;
                                break;
                            default:
                                temp[0][2] = choice;
                                if(player % 2 != 0){
                                    choice = 120;
                                }else {
                                    choice = 111;
                                }
                                arr[0][2] = choice;
                                player++;
                                break;
                        }
                    }

                    for (int[] ints : arr) {
                        System.out.println();
                        for (int m = 0; m < arr.length; m++) {
                            if (ints[m] != 0) {
                                System.out.print(" " + (char) ints[m] + " ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                    }
                    if(winner(arr)){
                        System.out.println(" ");
                        System.out.printf("The winner is: player %d", user(player));
                        choice = 0;
                        break;
                    }
                    if(player == 10) {
                        System.out.println(" ");
                        System.out.println("Tie");
                        choice = 0;
                        break;
                    }
                }catch (InputMismatchException e){
                    scanner.nextLine();
                    System.out.println("Please give an int from 1 - 9");
                }
            }
        }while (choice != 0);{
            System.out.println();
            System.out.println("Bye");
        }
    }

    /**
     * Check if the move that the user want to do it's already done from the other player
     * @param arr           the array that keeps the moves
     * @param choice        the move that the player want to do
     * @return              returns the array if the player can do this move or false if cant
     */
    public static boolean exist(int[][] arr, int choice){
        boolean alreadyPlayed = false;
        for (int[] ints : arr) {
            for (int k = 0; k < arr.length; k++) {
                if (choice == ints[k]) {
                    if ((ints[k] != 120) || (ints[k] != 111)) {
                        alreadyPlayed = true;
                        break;
                    }
                }
            }
        }
        return alreadyPlayed;
    }

    /**
     * Controls the players turn
     * @param player  the player that is playing
     * @return        returns which player can play
     */
    public static int user(int player){
        int winner;
        winner = player - 1;
        if(winner % 2 != 0){
            winner = 1;
        }else {
            winner = 2;
        }
        return winner;
    }

    /**
     *  Check if we have a winner after each turn
     * @param arr  the array that keep the moves
     * @return      return if we have a winner
     */
    public static boolean winner(int[][] arr){
        boolean win = false;
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i][i] == 120){
                count1++;
                if(count1 == 3){
                    win = true;
                    break;
                }
            }else if(arr[i][i] == 111){
                count2++;
                if(count2 == 3){
                    win = true;
                    break;
                }
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i][arr.length-i-1] == 120){
                count1++;
                if(count1 == 3){
                    win = true;
                    break;
                }
            }else if(arr[i][arr.length-i-1] == 111){
                count2++;
                if(count2 == 3){
                    win = true;
                    break;
                }
            }
        }
        for (int[] value : arr) {
            count1 = 0;
            count2 = 0;
            for (int j = 0; j < arr.length; j++) {
                if (value[j] == 120) {
                    count1++;
                    if (count1 == 3) {
                        win = true;
                        break;
                    }
                } else if (value[j] == 111) {
                    count2++;
                    if (count2 == 3) {
                        win = true;
                        break;
                    }
                }
            }
        }
        for(int i=0; i < arr.length; i++){
            count1=0;
            count2=0;
            for (int[] ints : arr) {
                if (ints[i] == 120) {
                    count1++;
                    if (count1 == 3) {
                        win = true;
                        break;
                    }
                } else if (ints[i] == 111) {
                    count2++;
                    if (count2 == 3) {
                        win = true;
                        break;
                    }
                }
            }
        }
        return win;
    }
}
