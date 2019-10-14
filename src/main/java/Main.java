import org.apache.commons.text.WordUtils;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String str = scanner.nextLine();

        System.out.print(WordUtils.wrap(str,13));


    }
}
