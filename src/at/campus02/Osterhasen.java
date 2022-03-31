package at.campus02;

public class Osterhasen {

    public int anzahlVersteckteEier;

    public void aendereAnzahlEier(int anzahlVersteckteEier) {
        // anzahlVersteckteEier --> lokale Variable oder Parameter mit dem gleichen Namen wie oben; bevorzugt
        // this-Referenz zeigt auf aktuelle Instanz
        this.anzahlVersteckteEier = anzahlVersteckteEier;
    }

    // Methoden überladen - unterscheiden sich durch Typ/Anzahl der Parameter
    // hier haben wir eine ohne Parameter - Osterhase soll ein Dutzend Eier verteilen

    public void aendereAnzahlEier() {
        anzahlVersteckteEier = 12;
        //this.anzahl... wäre möglich, aber nicht notwendig, da keine Namensgleichheit
    }


}
