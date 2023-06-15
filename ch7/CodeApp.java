package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * στην ασκηση αυτη ο χρηστης καλειται να δωσει εναν κωδικο οπου στην αρχη θα του δωσει κωδικοποιημενο σε μορφη ascii
 * και στην συνεχεια θα πρεπει να δωσει τα σωστα στοιχεια σε μορφη παλι ascii για να τον κωδικο
 */
public class CodeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code;
        System.out.println("Please put your Password");
        code = scanner.next();
        scanner.nextLine();
        coded(code);
        decoding();
    }

    /**
     *
     * @param code ο κωδικος που θα δωσει ο χρηστης στην φαση του coded θα μετατραπει σε ascii νουμερα
     */
    public static void coded(String code) {
        for (int i = 0; i < code.length(); i++) {
            int[] asc = new int[code.length()];
            asc[i] = (int) code.charAt(i);
            System.out.println(asc[i]);
        }
    }

    /**
     *
     *  στην 2η διαδικασια του decoding o χρησης θα δωσει τον κωδικο του χαρακτηρες σε μορφη ascii
     */
    public static void  decoding(){
        Scanner scanner = new Scanner(System.in);
        int[] asc =  new int[6];
        String[] decode = new String[6];
        System.out.println("Pleace insert the ascii numbers if yoy remember the correct numbres");
        for(int i = 0; i < asc.length; i++){
            asc[i]=scanner.nextInt();
            decode[i] = Character.toString(asc[i]);
        }
        for(int j = 0; j < decode.length;j++){
            System.out.print(decode[j]);
        }
    }
}
