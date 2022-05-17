package at.campus02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DogParty {
    public static void main(String[] args) {
        Dog scooby = new Dog("Scooby Doo", "black", 40, true);

        System.out.println(scooby);
        scooby.bark();

//        Dog hund = new Dog();
//        hund.bark();

        Beagle max = new Beagle("Max", "black", 25, true, "everything");
        System.out.println(max);
        Beagle hansi = new Beagle("Hansi", "blue", 80, false, "small children");
        System.out.println(hansi);
        hansi.bark();

        Dog hansi2 = new Dog("Hansi", "red", 100, false);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(scooby);
        dogs.add(hansi);
        dogs.add(max);
        dogs.add(hansi2);

        System.out.println(dogs);
        Collections.sort(dogs);
        System.out.println(dogs);
        //auch der Beagle kann mitsortiert werden, weil er auch ein Hund ist

        //sortieren anhand zweier Kriterien: Name und Gewicht




    }
}
