package at.campus02;

public class OsterApp {
    public static void main(String[] args) {
        Osterhasen dieter = new Osterhasen("Dieter (formerly known as Hansi)", 10);
        Osterhasen marla = new Osterhasen("Marla");

//        dieter.setAnzahlVersteckteEier(5);
//        dieter.setName("Dieter (formerly known as Hansi)");
        System.out.println(dieter.getAnzahlVersteckteEier());
        System.out.println(dieter.getName());
        System.out.println(marla.getName());

        //möchte ein Ei zur Anzahl der Eier dazuzählen
        dieter.setAnzahlVersteckteEier(dieter.getAnzahlVersteckteEier() + 1); //weil wir keine Variablennamen haben
        System.out.println(dieter.getAnzahlVersteckteEier());
    }
}
