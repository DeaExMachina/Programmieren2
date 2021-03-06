package at.campus02.hasenstall;

public class Hase implements GoesToParty{
    public String name;

    public Hase(String name) {
        this.name = name;
    }

    public void schlafen (){
        System.out.println(name + " schläft.");
    }

    public void hoppeln (){
        System.out.println(name + " hoppelt.");
    }

    public void fressen (){
        System.out.println(name + " frisst.");
    }

    @Override
    public void party(String drink, String cake) {
        System.out.println(name + " goes to a birthday party and drinks " + drink + " after eating " + cake);
    }
}
