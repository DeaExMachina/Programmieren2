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
    }
}
