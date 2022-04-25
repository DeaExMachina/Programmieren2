package at.campus02.hasenstall;

public class Hase {
    String name;

    public Hase(String name) {
        this.name = name;
    }

    public void schlafen (String name){
        System.out.println(name + " schläft.");
    }

    public void hoppeln (String name){
        System.out.println(name + " hoppelt.");
    }

    public void fressen (String name){
        System.out.println(name + " frisst.");
    }

}
