package uppgift3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        ArrayList<Person> personList = new ArrayList<>();

        System.out.println("Tryck 1 för att skapa en profil");
        int choice = scanner.nextInt();
            if (choice == 1) {
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
                for (Person p : personList) {
                    System.out.println(p);
                }
            }
        }
    }
