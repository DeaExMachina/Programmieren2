package at.campus02;

public class Dog implements Comparable<Dog> {
    public String name;
    public String eyeColor;
    public int weight;
    public boolean appreciatesOtherDogs;

//    public Dog(){
//        this.name = "Hund";
//        this.eyeColor = "black";
//        this.weight = 17;
//        this.appreciatesOtherDogs = true;
//    }

    public Dog(String name, String eyeColor, int weight, boolean appreciatesOtherDogs) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.appreciatesOtherDogs = appreciatesOtherDogs;
    }

    public void bark() {
        System.out.println(name + " barks");
    }

    @Override
    public String toString() {
        String text;
        if (appreciatesOtherDogs) {
            text = name + " admires other dogs with their sparkly " + eyeColor + " eyes.";
        } else {
            text = name + " barks until all the other dogs leave the party.";
        }

        return text;
    }

    public void eat() {
        System.out.println(name + " eats");
        bark();
    }


    @Override
    public int compareTo(Dog o) {
        //1.: Name
        int ergFirst = this.name.compareTo(o.name);
        if (ergFirst != 0){
            return ergFirst;
        }

        //2.: Gewicht (Wenn Name nicht eindeutig ist)
        if (this.weight < o.weight) {
            return -1; //this ist weiter vorn als other
        }
        if (this.weight > o.weight) {
            return 1;
        }
        return 0;

    }
}
