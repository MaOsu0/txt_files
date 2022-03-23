package Lekcja1.Serializable;

import java.io.Serializable;

class Person implements Serializable {
    private static final long serialVersionUID = 3000;

    private String firstName;
    private String lastName;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
