package at.campus02;

public class Beagle extends Dog {
    public String favouriteFood;

    //wenn wir keinen default-Konstruktor haben, müssen wir explizit den Konstruktor mit super() aufrufen
    public Beagle(String name, String eyeColor, int weight, boolean appreciatesOtherDogs, String favouriteFood){
        //super();
        super(name, eyeColor, weight, appreciatesOtherDogs);

        this.favouriteFood = favouriteFood;
    }

    @Override
    public void bark() {
        // eat(); -> we know that we can easily call other methods
        //super.bark(); -> "bark like a dog"
    }
}
