package at.campus02;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Osterhasen> mauritius = new ArrayList<>(); //meine erste Collection!

        Osterhasen karl = new Osterhasen("Karl von Karlingen", 1000, Hasenreligion.EXTRABUNTE_OSTEREIER);
        Osterhasen karla = new Osterhasen("Karla Kolumna", 111, Hasenreligion.ZUR_HEILIGEN_KAROTTE);
        Osterhasen uschi = new Osterhasen("Uschi mit den langen Ohren", 7777, Hasenreligion.LANGE_OHREN_ZEUGEN);

        //fügen Elemente hinzu:
        mauritius.add(karl);
        mauritius.add(karla);
        mauritius.add(uschi);

        //alle durchlaufen:

        for (int h = 0; h < mauritius.size(); h++) {
            System.out.println(mauritius.get(h));
        }

        //an welcher Stelle ist Karla?
        System.out.println(mauritius.indexOf(karla));

        //Karl redet den ganzen Tag nur von der Jagd, wird von der Insel gejagt
        //(entfernen eines Objekts aus der Collection)
        mauritius.remove(karl);

        //ist Karl wirklich weg?
        //for-each-loop: rechts die Collection, von der wir jedes Element haben wollen
        //links: neue Hilfsvariable, auf die das jeweils nächste Element gelegt wird
        for(Osterhasen oh : mauritius){ //oh = Osterhase
            System.out.println(oh);
        }



    }
}
