package at.campus02;

import java.util.ArrayList;

public class Customer extends Person{
    private int customerNumber;
    private ArrayList<Address> addresses = new ArrayList<>();


    public void addAddress (Address a) {
        addresses.add(a);
    }

    public Customer(String firstName, String lastName, int customerNumber) {
        super(firstName, lastName);
        this.customerNumber = customerNumber;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                '}';
    }
}
