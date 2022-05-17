package at.campus02.sortieren;

import java.util.Comparator;

public class ZunameKomparator implements Comparator<Mitarbeiter> {

    @Override
    public int compare(Mitarbeiter o1, Mitarbeiter o2) {
        return o1.getZname().compareTo(o2.getZname());
    }
}
