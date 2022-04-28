package at.campus02.orchester;

public class Gitarre extends Instrument {

    public Gitarre(String n, int l) {
        super(n, l);
    }

    @Override
    public int play() {
        System.out.println("Die Gitarre mit dem Namen " + name + " lässt ihre Saiten klingen");
        return lautstaerke;
    }
}
