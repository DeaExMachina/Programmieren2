package at.campus02;

public class SameNotSame {
    public static void main(String[] args) {
        //we want to find out which class an object is --> 2 possible ways
        //if possible, don't use at all --> use polymorphism instead!

        //situation 1: check if object of a class is exactly this class
        //(maybe less useful than the other variant)
        Beagle b = new Beagle("Doggo", "black", 17, true, "Spaghetti");
        System.out.println(b.getClass()); //shows class of the object
        System.out.println(Beagle.class); //shows class of Beagle
    }
}
