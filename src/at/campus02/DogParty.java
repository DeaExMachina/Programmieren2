package at.campus02;

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
    }
}
