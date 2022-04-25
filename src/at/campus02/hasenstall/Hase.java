package at.campus02.hasenstall;

public class Hase {
    String name;

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

}
