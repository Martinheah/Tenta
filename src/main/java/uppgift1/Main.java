package uppgift1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (userInput.isBlank()) {
            System.out.println("Hej, Vad heter du ?");
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("Örjan")) {
                System.out.println("Namnet börjar på bokstaven Ö och det är den sista bokstaven i alfabetet!");
            } else if (userInput.equalsIgnoreCase("Lena")) {
                System.out.println("Namnet börjar på bokstaven L!");
            }
        }
    }
}

