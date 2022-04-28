package at.campus02.orchester;

import java.util.ArrayList;

public class Orchester {
    private ArrayList<Instrument> or;

    public Orchester(){
        or = new ArrayList<>();
    }

    public int playAll(){
        int summe = 0;
        for(Instrument i : or){
            summe += i.play();
        }
        return summe;
    }

    public void addInstrument(Instrument i){ //this is UPCASTING!
        or.add(i);
    }
}
