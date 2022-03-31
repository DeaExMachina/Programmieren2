package at.campus02;

public class Bruch {
    private int numerator;
    private int denominator;

    public Bruch (int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {
        //liefert double als Dezimalzahl zurück
        return (double) numerator / denominator;
    }

    public void print(){
        //gibt Ergebnis aus, z.B. als 5/7
        System.out.println(numerator + " / " + denominator);
    }

    public Bruch multiplicate(Bruch b2){
        //b2 mit den eigenen Werten multiplizieren --> auf num und denom gespeichert
        Bruch erg = new Bruch(numerator, denominator);
        erg.numerator = erg.numerator * b2.numerator;
        erg.denominator = erg.denominator * b2.denominator;
        return erg;
    }

    public Bruch multiplicate(Bruch b2, Bruch b3) {
        b3.numerator = b2.numerator * b3.numerator;
        b3.denominator = b2.denominator * b3.denominator;
        return b3;
    }

    public Bruch add(Bruch b2) {
        b2.numerator = b2.numerator + b2.numerator;
        b2.denominator = b2.denominator + b2.denominator;
        return b2;
    }
}
