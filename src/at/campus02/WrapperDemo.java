package at.campus02;

public class WrapperDemo {
    //aufgrung von Auto-Boxing können Integer und int stellvertretend verwendet werden

    public static void main(String[] args) {
        Integer i = 22;
        System.out.println(i);
        int j = new Integer(27);
        System.out.println(j);

        int l = Integer.parseInt("16"); //macht String zu Integer
        System.out.println(l);

        System.out.println("16" + 2); //String wird nicht mit Integer addiert
        System.out.println(l + 2); //hier wird addiert, da beides Integers sind


    }
}
