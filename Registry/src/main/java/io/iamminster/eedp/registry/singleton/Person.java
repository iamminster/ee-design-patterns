package io.iamminster.eedp.registry.singleton;

public class Person {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = 1;
    }

    public String getLastName() {
        return lastName;
    }
}
