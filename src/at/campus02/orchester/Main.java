package at.campus02.orchester;

public class Main {
    public static void main(String[] args) {
        Gitarre g = new Gitarre("Roberto", 10);
        Flöte f = new Flöte ("Hansi", 8);
        Orgel o = new Orgel("Orgelito", 14);

        Orchester or = new Orchester();
        or.addInstrument(g); //this is UPCASTING! --> Instrument verlangt, aber Gitarre geliefert (= spezielles Instrument)
        or.addInstrument(f);
        or.addInstrument(o);
        or.playAll();
    }
}
