package at.campus02;

public class HashProblems {
    public static void main(String[] args) {

        //zeigen, dass theoretisch unterschiedliche Strings/Objekte denselben Hashcode haben können

        String s1 = "VII";
        String s2 = "Ugh";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}