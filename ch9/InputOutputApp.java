package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;


public class InputOutputApp {
    public static void main(String[] args) throws IOException {

        String line;
        String[] student;
        double average;

        File log = new File("C:\\Users\\Nikos\\IdeaProjects\\CodingFactoryTestbed\\src\\gr\\aueb\\cf\\ch1");
        File av = new File("C:\\Users\\Nikos\\IdeaProjects\\CodingFactoryTestbed\\src\\gr\\aueb\\cf\\ch1");

        if(!av.exists()){
            System.err.println("Error in make average file");
            System.exit(1);
        }
        if(!log.exists()){
            System.err.println("Error in make log file");
            System.exit(1);
        }

        File logFile = new File(log + "/" + "log.txt");
        File avFile = new File(av + "/" + "av.txt");

       try (BufferedReader bf = new BufferedReader( new FileReader("C:\\Users\\Nikos\\IdeaProjects\\CodingFactoryTestbed\\src\\gr\\aueb\\cf\\ch1\\grades.txt"))){
           PrintStream aver = new PrintStream(avFile,StandardCharsets.UTF_8);
           PrintStream logg = new PrintStream(logFile,StandardCharsets.UTF_8);


        while ((line = bf.readLine()) != null){
            student = line.split(" +");

            for(String s : student){
                System.out.print(s + " ");
            }
            System.out.println(student.length);
            System.out.println();
            int num1 = Integer.parseInt(student[2]);
            int num2 = Integer.parseInt(student[3]);

            if((num1 > 0 && num1 <= 10) && (num2 > 0 && num2 <= 10)){
                average = (double) (num1 + num2)/2;
                print(aver,student);
                print(aver,average);

            }else {
                print(logg,student);
                printlog(logg,student);
            }
        }
       }catch (IOException e){
           System.err.println("File not found");
       }
    }

    public static void print(PrintStream ps,String[] tokens){
        for(int i = 0; i < 2; i++){
            ps.print(tokens[i] + " ");
        }
    }

    public  static  void print(PrintStream ps,double message){
        ps.println(message);
    }

    public static void printlog(PrintStream ps,String[] tokens){
        for(int i = 2; i < tokens.length; i++){
            ps.print(tokens[i] + " ");
        }
    }
}
