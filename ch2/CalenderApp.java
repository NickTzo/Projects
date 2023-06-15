package gr.aueb.cf.ch2;
import java.util.Scanner;

public class CalenderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputDate = 0;
        int inputMonth = 0;
        int inputYear = 0;
        int year = 0;

        System.out.println("Please insert date month and year");
        inputDate = scanner.nextInt();
        inputMonth = scanner.nextInt();
        inputYear = scanner.nextInt();

        year = inputYear % 100;

        System.out.printf("%02d/%02d/%d", inputDate, inputMonth, year);
    }
}
