package at.campus02;

import java.util.List;

public class SameNotSame {
    public static void main(String[] args) {
        //we want to find out which class an object is --> 2 possible ways
        //if possible, don't use at all --> use polymorphism instead!

        //situation 1: check if object of a class is exactly this class
        //(maybe less useful than the other variant)
        Beagle b = new Beagle("Doggo", "black", 17, true, "Spaghetti");
        System.out.println(b.getClass()); //shows class of the object
        System.out.println(Beagle.class); //shows class of Beagle

        if (b.getClass().equals(Beagle.class)) {
            System.out.println("The same!");
        }
        Object obj = b;
        System.out.println(obj.getClass()); //now I know for sure that it's a Beagle
        //so downcasting won't be any error
        Beagle b2 = (Beagle) obj;



    //situation 2: var instance of ClassName
    //here, we are not interested in the exact type, but whether it is able to do all necessary stuff
    //this means, I am the correct class or subclass or an interface implementing a class

    if(b instanceof Beagle)

    {
        System.out.println("yep");}
    if (b instanceof Dog)

    {
        System.out.println("yep");
    }
    if (obj instanceof Dog){
        System.out.println("yep");
    }

    //now we could get checked all kind of subclasses of animals and save them as an animal reference
        // and execute animal methods

        // List<Dog> meineListe = eine_funkt(); //new ArrayList<>();

    }
}
