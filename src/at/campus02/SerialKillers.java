package at.campus02;

import java.util.HashSet;

public class SerialKillers {
    //als angehende neue Serienkillerin (damit sind keine bösartigen Personen gemeint, sondern solche, die gern
    //und viele Serien schauen) möchten Sie sich beim Verein der Serienkiller anmelden - daher brauchen Sie einen
    //eigenen einzigartigen Nickname, um in die Geschichtsbücher einzugehen.

    public static void main(String[] args) {
        HashSet<String> serialNicknames = new HashSet<>();

        serialNicknames.add("Ted Bundy");
        serialNicknames.add("Hannibal Lecter");
        serialNicknames.add("Zodiac Killer");

        for(String s : serialNicknames) {
            System.out.println(s); //Ausgabe erfolgt in willkürlicher Reihenfolge
        }

        System.out.println(serialNicknames.add("Ted Bundy")); //return "false", weil Element bereits enthalten ist
    }

}
