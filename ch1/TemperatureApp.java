package gr.aueb.cf.ch1;
import java.util.Scanner;

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputFareh = 0;
        int celc = 0;


        System.out.println("Please insert temperature");
        inputFareh = scanner.nextInt();
        celc = 5 * (inputFareh - 32) / 9;

        celc = (int)celc;

        System.out.printf("%d\u2103 is %d\u2109", inputFareh , celc);
        /**
         *  Η διαφορετικα */
        System.out.printf("%d/u00B0F = %du00B0C" ,inputFareh , celc);


    }
}
