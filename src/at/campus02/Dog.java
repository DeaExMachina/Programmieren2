package at.campus02;

public class Dog {
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

    public void bark(){
        System.out.println(name + " barks");
    }

    @Override
    public String toString() {
       String text;
       if(appreciatesOtherDogs){
           text = name + " admires other dogs with their sparkly " + eyeColor + " eyes.";
       }
       else {
           text = name + " barks until all the other dogs leave the party.";
       }

       return text;
    }

    public void eat(){
        System.out.println(name + " eats");
        bark();
    }
}
