package at.campus02;

public class Tuer {
    private double breite = 1.0;
    private double hoehe = 2.10;
    private Himmelsrichtung oeffnungsrichtung;

    public Tuer(double breite, double hoehe, Himmelsrichtung oeffnungsrichtung) {
        this.breite = breite;
        this.hoehe = hoehe;
        this.oeffnungsrichtung = oeffnungsrichtung;
    }

    public Himmelsrichtung getOeffnungsrichtung() {
        return oeffnungsrichtung;
    }

    @Override
    public String toString() {
        return "Die Tür ist " + breite + "m breit und " + hoehe + "m hoch. Sie öffnet sich nach " + oeffnungsrichtung;
    }

    public void setOeffnungsrichtung(Himmelsrichtung oeffnungsrichtung) {
        this.oeffnungsrichtung = oeffnungsrichtung;

    }

    public static void main(String[] args) {
        Tuer tuerKei = new Tuer(1.5, 2.10, Himmelsrichtung.NORDEN);
        System.out.println(tuerKei);


    }
}
