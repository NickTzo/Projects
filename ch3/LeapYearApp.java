package gr.aueb.cf.ch3;
import java.util.Scanner;
public class LeapYearApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = 0;
        System.out.println("Please insert a year");
        inputYear = scanner.nextInt();
        if (inputYear % 4 == 0) {
            if (inputYear % 100 != 0) {
                System.out.println("Το ετος  ειναι δισεκτο!");
            } else if (inputYear % 400 != 0) {
                System.out.println("Το ετος δεν ειναι δισεκτο!");
            } else {
                System.out.println("Το ετος   ειναι δισεκτο!");
            }
        }else {
            System.out.println("Το ετος δεν ειναι δισεκτο!");
        }
    }
}
