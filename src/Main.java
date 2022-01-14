import java.util.HashMap;
import java.util.Scanner;

/*
 This program lets the user create and view a phonebook.
 */

public class Main {

    public static void main(String[] args) {
        Maps maps = new Maps(new HashMap<>());
        Scanner input = new Scanner(System.in);


        boolean quit = false;
        while (!quit) {
            System.out.println("\nPress \n\t 0 - to create a phonebook. \n\t 1 - to view the phonebook \n\t 2 - to quit \nEnter your choice: ");


            switch (input.nextInt()) {

                case 0:
                    addToMaps(input, maps);
                    break;

                case 1:
                    viewMaps(input, maps);
                    break;

                case 2:
                    quit = true;
            }
        }

    }

    public static void addToMaps(Scanner scanner, Maps maps) {
        System.out.println("Enter a name: ");
        String a = scanner.next();
        System.out.println("Enter a number");
        int b = scanner.nextInt();
        maps.AddToMap(a, b);
        System.out.println(maps);


    }

    public static void viewMaps(Scanner scanner, Maps maps) {
        System.out.println("Enter a name to view their number");
        String name = scanner.next();
        maps.viewMap(name);
        System.out.println("The number of " + name + ": " + maps.getMap(name));
    }
}
