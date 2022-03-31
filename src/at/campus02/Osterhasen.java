package at.campus02;

public class Osterhasen {

    private String name;
    public int anzahlVersteckteEier;

    public Osterhasen(String name, int anzahlVersteckteEier) { //Konstruktor
        this.name = name;
        this.anzahlVersteckteEier = anzahlVersteckteEier;
    }

    public Osterhasen(String name){
        this.name = name;
        this.anzahlVersteckteEier = 0;
    }

//    public void aendereAnzahlEier(int anzahlVersteckteEier) {
//        // anzahlVersteckteEier --> lokale Variable oder Parameter mit dem gleichen Namen wie oben; bevorzugt
//        // this-Referenz zeigt auf aktuelle Instanz
//        this.anzahlVersteckteEier = anzahlVersteckteEier;
//    }

    // Methoden überladen - unterscheiden sich durch Typ/Anzahl der Parameter
    // hier haben wir eine ohne Parameter - Osterhase soll ein Dutzend Eier verteilen

//    public void aendereAnzahlEier() {
//        anzahlVersteckteEier = 12;
        //this.anzahl... wäre möglich, aber nicht notwendig, da keine Namensgleichheit
//    }

//    public void gibMirAnzahlDerVerstecktenEier (int anzahlVersteckteEier) {
//        if (anzahlVersteckteEier >= 0) {
//            this.anzahlVersteckteEier = anzahlVersteckteEier;
//        }
//    }

    // Getter und Setter über Code - Generate - Getter and Setter generieren

    public int getAnzahlVersteckteEier() {
        return anzahlVersteckteEier;
    }

    public void setAnzahlVersteckteEier(int anzahlVersteckteEier) {
        if (anzahlVersteckteEier >= 0) {
            this.anzahlVersteckteEier = anzahlVersteckteEier;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

