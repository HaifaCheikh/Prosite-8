package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.enums.Food;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Lion1");
        try {
            lion.setAge(10);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Tunis");
        Zoo notMyZoo = new Zoo("WaterPark", "Bizerte");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        try {
            myZoo.addAnimal(lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }
        try {
            myZoo.addAnimal(dog);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        try {
            myZoo.addAnimal(lion);
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(myZoo.getName() + " contient " + myZoo.getNbrAnimals() + " animaux");
        }

        myZoo.displayAnimals();

        Dolphin d = new Dolphin();
        d.setSwimmingSpeed(30.1f);
        Dolphin d1 = new Dolphin();
        d1.setSwimmingSpeed(20.5f);
        Dolphin d2 = new Dolphin();
        d2.setSwimmingSpeed(20.9f);
        Dolphin d3 = new Dolphin();
        d3.setSwimmingSpeed(21.7f);


        myZoo.addAquaticAnimal(d);
        myZoo.addAquaticAnimal(d1);
        myZoo.addAquaticAnimal(d2);
        myZoo.addAquaticAnimal(d3);
        Penguin p = new Penguin();
        p.setSwimmingDepth(25.8f);
        Penguin p1 = new Penguin();
        p1.setSwimmingDepth(28.5f);
        Penguin p2 = new Penguin();
        p2.setSwimmingDepth(100.6f);
        Penguin p3 = new Penguin();
        p1.setSwimmingDepth(1.6f);
        myZoo.addAquaticAnimal(p);
        myZoo.addAquaticAnimal(p1);
        myZoo.addAquaticAnimal(p2);
        myZoo.addAquaticAnimal(p3);
        myZoo.addAquaticAnimal(new Penguin());


        for (int i = 0; i < myZoo.getNbrAquatics(); i++) {
            Aquatic[] aquatics = myZoo.getAquaticAnimals();
            aquatics[i].swim();
        }

//        myZoo.displayNumberOfAquaticsByType();

//        System.out.println(myZoo.maxPenguinSwimmingDepth());


        System.out.println("Data");

        Penguin penguin = new Penguin("Wild animals", "Pingu", 3, true, "Ocean", 25.6f);
        penguin.eatMeat(Food.MEAT);

        Dolphin dolphin = new Dolphin("Delphinoidea", "Willy", 5, true, "Ocean", 34.2f);
        dolphin.eatMeat(Food.MEAT);

        Terrestrial terrestrial = new Terrestrial("Bears", "Winnie", 6, true, 4);
        terrestrial.eatPlantAndMeet(Food.BOTH);

        Terrestrial terrestrial2 = new Terrestrial("Rabbits", "Bugs bunny", 2, true, 4);
        terrestrial2.eatPlants(Food.PLANTS);

    }

}