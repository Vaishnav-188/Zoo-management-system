import java.util.ArrayList;

class Animal {
    String type;
    String name;
    int age;
    double weight;

    Animal(String type, String name, int age, double weight) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void display() {
        System.out.println(type + " → Name: " + name + " | Age: " + age + " | Weight: " + weight + " kg");
    }
}

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(String type, String name, int age, double weight) {
        if (type.equalsIgnoreCase("Tiger") ||
            type.equalsIgnoreCase("Lion") ||
            type.equalsIgnoreCase("Deer") ||
            type.equalsIgnoreCase("Crocodile") ||
            type.equalsIgnoreCase("Snake") ||
            type.equalsIgnoreCase("Giraffe")) {

            animals.add(new Animal(type, name, age, weight));
            System.out.println("✅ " + type + " added successfully!");
        } else {
            System.out.println("❌ Sorry, only Tiger, Lion, Deer, Crocodile, Snake, or Giraffe can be added.");
        }
    }

    public void showAnimals() {
        if (animals.isEmpty()) {
            System.out.println("🐾 No animals in the zoo yet!");
        } else {
            System.out.println("\n--- Animals in the Zoo ---");
            for (int i = 0; i < animals.size(); i++) {
                System.out.print((i + 1) + ") ");
                animals.get(i).display();
            }
        }
    }

    public int getTotalAnimals() {
        return animals.size();
    }
}
