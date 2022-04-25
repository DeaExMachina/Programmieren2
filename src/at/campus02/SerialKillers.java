package at.campus02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

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

        serialNicknames.add("Edmund Kemper");
        serialNicknames.add("Jack the Ripper");
        serialNicknames.add("Edmund Kemper");

        for(String s : serialNicknames) {
            System.out.println(s);
        }

        // serialNicknames.retain
        //zweites Set nur für AmerikanerInnen
        HashSet<String> americanSerialKiller = new HashSet<>();
        americanSerialKiller.add("Ted Bundy");
        americanSerialKiller.add("Edmund Kemper");
        americanSerialKiller.add("Hannibal Lecter");

        //entfernt alle Elemente, die nicht in americanSerialKiller sind, aus serialNicknames
        serialNicknames.retainAll(americanSerialKiller);
        System.out.println("----------");
        for(String s : serialNicknames) {
            System.out.println(s);
        }

        //in einer HashMap wollen wir alle Opfer der Serienkiller speichern

        HashMap<String, ArrayList<String>> opfer = new HashMap<>();
        //wenn ich hier (und nicht in der for-Schleife) meine ArrayList erzeuge, habe ich insgesamt nur eine
        //ArrayList und würde jedem Serienkiller dieselbe Liste zuweisen (das kann nicht richtig sein, weil ein
        //Opfer ja nicht mehrmals ermordet werden kann)

        for(String crazyAmerican : americanSerialKiller) {
            ArrayList<String> o = new ArrayList<>();
            o.add("Opfer 1");
            o.add("Opfer 2");
            o.add("Opfer 3");

            opfer.put(crazyAmerican, o); //jeder Serienkiller hat eine eigene Opferliste
        }

        //wie kann man Opfer hinzufügen? --> Indem wir es in die Opferliste packen
        //Wie kommen wir zur Opferliste?
        //Ted Bundy soll ein 4. Opfer bekommen

        ArrayList<String> opfi = opfer.get("Ted Bundy");

        opfi.add("Opfer 4");

    }
}
