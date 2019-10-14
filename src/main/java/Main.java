import org.apache.commons.text.WordUtils;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        System.out.print(WordUtils.wrap(scanner.nextLine(),13));


    }
}
