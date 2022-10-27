import java.util.Scanner;

public class uppgift6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Nämn en av rollerna inom Scrum");
        String answer1 = scanner.nextLine();
        if (answer1.equals("Scrum Master")) {
            System.out.println("Rätt svar, 1 poäng!");
            System.out.println("Nämn en av ceremonierna inom Scrum");
            counter++;
            String answer2 = scanner.nextLine();
            if (answer2.equals("Sprint Planning")) {
                System.out.println("Rätt svar, ytterliggare 1 poäng!");
                System.out.println("Vad är rekommenderat max antal poäng i ett Team?");
                counter++;
                int answer3 = scanner.nextInt();
                if (answer3 < 10 && answer3 > 2) {
                    System.out.println("Rätt svar, ytterliggare 1 poäng");
                    System.out.println("Scrum har ett dokument där all information om Scrum finns vad heter det?");
                    counter++;
                    String answer4 = scanner.nextLine();
                    if (answer4.equals("Scrum Guide")) {
                        System.out.println("Rätt svar, ytterliggare 1 poäng");
                        System.out.println("Vem är den som får avbryta en Sprint?");
                        counter++;
                        String answer5 = scanner.nextLine();
                        if (answer5.equals("Product Owner")) {
                            System.out.println("Grattis du har fått alla rätt! (5)");
                        } else {
                            System.out.println("Fel svar du fick totalt " + counter + " rätt, bra jobbet");
                        }
                    } else {
                        System.out.println("Fel svar du fick totalt " + counter + " rätt, bra jobbet");
                    }
                }
            } else {
                System.out.println("Fel svar" + "du har totalt" + counter + " rätt" + "du får läsa på lite");
            }
        } else {
            System.out.println("Fel svar" + "du har totalt" + counter + " rätt" + "du får läsa på lite");
        }
    }
}
