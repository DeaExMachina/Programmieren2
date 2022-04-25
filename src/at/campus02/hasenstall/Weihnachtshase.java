package at.campus02.hasenstall;

public class Weihnachtshase extends Hase {

    public Weihnachtshase(String name) {
        super(name);
    }

    public void verteileGeschenke (){
        System.out.println(name + " verteilt Geschenke.");
    }

    @Override
    public void hoppeln(String name){
        System.out.println(name + " hoppelt frierend durch den Schnee.");
    }

}
