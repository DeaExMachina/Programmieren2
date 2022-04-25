package at.campus02;

public class CustomerApp {
    public static void main(String[] args) {
        Address a1 = new Address("Neue Welt 7", "8010", "Graz", "AT");
        Address a2 = new Address("Himmelreichgasse 10", "8043", "Graz", "AT");

        Customer c1 = new Customer("Susi", "Sonnenschein", 1);
        Customer c2 = new Customer("Hansi", "Hinterseer", 2);

        c1.addAddress(a1);
        c2.addAddress(a2);
        System.out.println(c1);
        System.out.println(c2);

        c1.eatChocolate();
        c2.eatChocolate();
    }
}
