package pl.edu.wszib.jwd.pl.lab14;

import java.util.Random;

public class AnimalShelter {

    public static void main(String[] args) {

      /*  Animal[] animals = {new Dog(),new Dog(),new Dog(), new Cat()};



        System.out.println(animals[0].getInstanceNumber());
        System.out.println(animals[0].getType());

        System.out.println(animals[3].getInstanceNumber());
        System.out.println(animals[3].getType());*/

        Animal[] animals = new Animal[100];
        Random random = new Random();

        for (int i = 0; i < animals.length; i++) {
            int r = random.nextInt(3); // 1 2 3
            switch (r) {
                case 0:
                    animals[i] = new Dog();
                    break;
                case 1:
                    animals[i] = new Cat();
                    break;
                case 2:
                    animals[i] = new Hamster();
                    break;
            }
        }

        System.out.println(animals[32].getType() + " - " + animals[32].getInstanceNumber());

            for (Animal animal : animals) {
                System.out.println(animal.getType());
            }
    }
}
