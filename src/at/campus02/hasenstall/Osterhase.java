package at.campus02.hasenstall;

public class Osterhase extends Hase {

    public Osterhase(String name) {
        super(name);
    }

    public void versteckeOstereier(){
        System.out.println(name + " versteckt haufenweise Ostereier.");
    }

    @Override
    public void hoppeln(){
        System.out.println(name + " hoppelt über grüne, österliche Wiesen.");
    }
}
