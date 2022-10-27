package uppgift2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (userInput.isBlank()) {
            System.out.println("Hej, Vad heter du ?");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "Lena":
                    System.out.println("Namnet börjar på bokstaven L!");
                    break;
                case "Örjan":
                    System.out.println("Namnet börjar på bokstaven Ö och det är sista bokstaven i alfabetet!");
                    break;
            }
        }
    }
}
