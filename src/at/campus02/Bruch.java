package at.campus02;

public class Bruch {
    private int numerator;
    private int denominator;

    public Bruch (int numerator, int denominator) {
        this.numerator = 0;
        this.denominator = 0;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

//    public double toDecimal() {
//        //liefert double als Dezimalzahl zurück
//    }

    public void print(){
        //gibt Ergebnis aus, z.B. als 5/7
        System.out.println(numerator + " / " + denominator);
    }

    Bruch b1 = new Bruch(7, 6);
    Bruch b2 = new Bruch(2, 5);
    Bruch b3 = new Bruch(4, 16);


    public Bruch multiplicate(Bruch b2){
        //b2 mit den eigenen Werten multiplizieren
        b2.numerator = b2.numerator * b2.numerator;
        b2.denominator = b2.denominator * b2.denominator;
        return b2;
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
