import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zoo zoo = new Zoo();
        int choice;

        System.out.println("🦁 Welcome to Mini Zoo Management System 🐾");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Show all animals");
            System.out.println("2. Add new animal");
            System.out.println("3. Show total animals");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    zoo.showAnimals();
                    break;

                case 2:
                    System.out.println("Available animals: Tiger, Lion, Deer, Crocodile, Snake, Giraffe");
                    System.out.print("Which animal do you want to add? ");
                    String type = sc.nextLine();
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter weight (kg): ");
                    double weight = sc.nextDouble();
                    sc.nextLine(); // clear buffer
                    zoo.addAnimal(type, name, age, weight);
                    break;

                case 3:
                    System.out.println("Total animals in zoo: " + zoo.getTotalAnimals());
                    break;

                case 4:
                    System.out.println("Exiting... Bye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
