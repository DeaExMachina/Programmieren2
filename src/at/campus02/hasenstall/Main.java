package at.campus02.hasenstall;

public class Main {

    public static void main(String[] args) {

        Hase bugs = new Hase("Bugs Bunny");
        Hase klopfer = new Hase("Klopfer");

        bugs.fressen();
        klopfer.schlafen();

        Hase fluffy = new Weihnachtshase("Fluffy");
        fluffy.hoppeln();

        Hase hansi = new Osterhase("Hansi");
        hansi.hoppeln();

        //let's try up- and downcasting:

        //upcasting: Osterhase to Hase
        Hase beispiel = hansi;
        beispiel.hoppeln(); //Osterhasen-Implementation wird verwendet
        //we don't know the specific osterhasen methods any longer, only offers Hase class methods

        //if we know that there is a Osterhase behind, we can downcast
        Osterhase beispiel2 = (Osterhase) beispiel;
        beispiel2.versteckeOstereier();
        //würde nicht mit Weihnachtshase klappen -> Osterhase ist kein Teil von Weihnachtshase!

        Hasenstall hs = new Hasenstall();
        hs.addHase(beispiel2);
        hs.addHase(fluffy);

        hs.hoppelAll();


        //trying around with up- and downcasting
        Osterhase o1 = new Osterhase("Mrs. Egg");
        Osterhase o2 = o1;
        Hase h1 = new Hase("Common Rabbit, cute");
        Weihnachtshase w1 = new Weihnachtshase("Mr. Snow");

        Weihnachtshase wh;
        Osterhase oh;
        Hase h;

        //Vererbungshierarchie:
        //                      ---> Osterhase
        // Object --> Hase ---
        //                      ---> Weihnachtshase

        //Upcasting: Assigning a child class to a reference of its parent class
        //example:
        h = o1; //assign from right (child class Osterhase) to left (parent class Hase)
        //THIS IS UPCASTING

        //what is the difference if I access now Mrs. Egg via the h Hase reference?
        //"verstecke Ostereier" is missing because we only see attributes and methods the Hase has
        // h.
        //with o1. it will work to versteckeOstereier!
        h.hoppeln(); //comes out with Osterhase reference!
        //the nice thing is: if we call a method already known to the Hase from the closest implementation,
        //the nearest one will be executed --> in our case, that's the one of Osterhase

        //Downcasting: assigning a general type to a more specialised one (ATTENTION: this only works if the
        //general reference already refers to a concrete specialised object instance!)
        // wh = (Weihnachtshase) h1; --> this gives us a class cast exception
        //but there are special cases when downcasting works:
        //I will have to upcast before:
        h = w1;
        //we know that this Hase reference is really a Weihnachtshase (we know it from somewhere)
        wh = (Weihnachtshase) h;
        h.hoppeln();
        wh.hoppeln();




    }
}
