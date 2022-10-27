package uppgift4;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void message() {
        System.out.println("Tryck 1 för att skapa en profil"
                + "\nTryck 2 för att läsa innehållet");

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        Person person = new Person();
        ArrayList<Person> personList = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();

        do {
            message();
            userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Mata in ditt förnamn!");
                    String userName = scanner.next();
                    person.setFirstName(userName);

                    System.out.println("Mata in ditt efternamn!");
                    String userLastName = scanner.next();
                    person.setLastName(userLastName);

                    System.out.println("Mata in din favorit film");
                    String userFavouriteMovie = scanner.next();
                    person.setFavouriteMovie(userFavouriteMovie);
                    personList.add(person);

                    mapper.writeValue(Paths.get("src/main/java/person.json").toFile(), personList);
                    break;
            }

        } while (userChoice != 2);
        for (Person p:personList){
            System.out.println(p.toString());
        }
    }
}
