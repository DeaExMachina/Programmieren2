package at.campus02;

public class Osterhasen {

    public int anzahlVersteckteEier;

    public void aendereAnzahlEier(int anzahlVersteckteEier) {
        // anzahlVersteckteEier --> lokale Variable oder Parameter mit dem gleichen Namen wie oben; bevorzugt
        // this-Referenz zeigt auf aktuelle Instanz
        this.anzahlVersteckteEier = anzahlVersteckteEier;

    }


}
