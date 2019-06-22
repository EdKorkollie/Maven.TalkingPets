package io.zipcoder.polymorphism;

public class Cat extends Pets{

    Cat(String name) {
        super(name);
    }
    public String speak() {
        return "meow";
    }
}
