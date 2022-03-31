package at.campus02;

public class OsterApp {
    public static void main(String[] args) {
        Osterhasen dieter = new Osterhasen();

        dieter.aendereAnzahlEier(5);
        System.out.println(dieter.anzahlVersteckteEier);
    }
}
