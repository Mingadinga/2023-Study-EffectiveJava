package org.example.item2;

public class Person {
    private final String name;
    private final int age;
    private final String address;

    private Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    private static class PersonBuilder implements Builder<Person> {
        private String name;
        private int age;
        private String address;

        public PersonBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        @Override
        public Person build() {
            return new Person(name, age, address);
        }
    }
}