package challenge2.modified;



import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("1", "kali"));
        animals.add(new Fish("2", "Nemo"));
        // Add Dog that runs and swims
        animals.add(new Dog("3", "Snoopy"));


        // Listing all animals eating
        for (Animal animal : animals) {
            animal.eat();
        }

        // How we can list the animal names?
        // <code for loop here>
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }

        // How we can list the animals running?
        // <code for loop here>
        for (Animal animal : animals) {
            if (animal.canRun()) {
                System.out.println(animal.name);
            }
        }

        // How we can list the animals swimming?
        // <code for loop here>
        for (Animal animal : animals) {
            if (animal.canSwim()) {
                System.out.println(animal.name);
            }
        }
    }
}

