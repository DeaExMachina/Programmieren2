package at.campus02.abstractOrchester;

public class Flöte extends Instrument {
    public Flöte(String n, int l) {
        super(n, l);
    }

    @Override
    public int play() {
        System.out.println("Die Flöte " + name + " quietscht fast immer richtig");
        return lautstaerke;
    }
}
