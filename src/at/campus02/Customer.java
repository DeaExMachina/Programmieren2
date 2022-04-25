package at.campus02;

import java.util.ArrayList;

public class Customer extends Person{
    private int customerNumber;
    private ArrayList<Address> addresses = new ArrayList<>();


    public void addAddress (Address a) {
        addresses.add(a);
    }

    public Customer(String firstName, String lastName, int customerNumber) {
        super(firstName, lastName); //muss in der 1. Zeile aufgerufen werden!
        this.customerNumber = customerNumber;
        this.addresses = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses + "person: " +
                lastName + '\'' +
                '}';
    }
}
