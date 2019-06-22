package io.zipcoder.polymorphism;

public class Dog extends Pets{

    Dog(String name) {
        super(name);
    }
    public String speak() {
        return "woof woof";
    }
}
