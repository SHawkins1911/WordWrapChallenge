import org.apache.commons.text.WordUtils;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //Create a Scanner to capture input string
        Scanner scanner = new Scanner(System.in);

        //Request a sentence from the user
        System.out.println("Please enter a sentence");

        //Print input string wrapped with indicated wrapLength
        System.out.print(WordUtils.wrap(scanner.nextLine(),13));


    }
}
