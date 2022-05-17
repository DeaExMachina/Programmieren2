package at.campus02.sortieren;

import java.util.Arrays;
import java.util.Collections;

public class SortierApp {
    public static void main(String[] args) {
        int[] intArr = {27, -12, 4, 29, 34};
        String[] strArr = {"Hansis Beste", "Hansis Allerbeste Hits", "Hansis erste Hits", "Hansis neueste Schlager"};
        Mitarbeiter[] mArr = {new Mitarbeiter("Hansi", "Hinterseer", 1954), new Mitarbeiter("Sonja", "Sonnenblume", 1970), new Mitarbeiter("Helene", "Fischer", 1984)};

        System.out.println(Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        System.out.println(Arrays.toString(strArr));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        System.out.println(Arrays.toString(mArr));
        Arrays.sort(mArr);
        System.out.println(Arrays.toString(mArr));

        //now with Comparator
        Arrays.sort(mArr, new ZunameKomparator());
        System.out.println(Arrays.toString(mArr));
    }


}
