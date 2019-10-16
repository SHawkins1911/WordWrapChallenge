import org.apache.commons.text.WordUtils;

import java.util.Scanner;


public class Main {

     public static void main(String[] args) {

         //Create a Scanner to capture user input
         Scanner scanner = new Scanner(System.in);

         //Request a sentence from the user
         System.out.println("Please enter a sentence");


        //Transform input from String to String [] of words split on " " delimiter
        String [] words = scanner.nextLine().split(" ");

        //Get requested line width from user
        System.out.println("Please enter requested line width");
        int lineWidth = scanner.nextInt();

        //Call static method wrappedText() from WordWrap class and print results
        System.out.print(WordWrap.wrappedText(words, lineWidth ));

        //Original solution using static wrap method from apache commons WordUtils
        //System.out.print(WordUtils.wrap(scanner.nextLine(),13));


    }
}
