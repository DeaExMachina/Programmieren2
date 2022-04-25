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

    }
}
