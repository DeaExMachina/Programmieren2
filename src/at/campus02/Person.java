package at.campus02;

public class Person {

    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void eatChocolate() {
        System.out.println(firstName + " " + lastName + " eats chocolate.");
    }

}
