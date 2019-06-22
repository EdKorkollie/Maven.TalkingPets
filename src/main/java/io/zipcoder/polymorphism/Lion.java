package io.zipcoder.polymorphism;

public class Lion extends Pets{

    Lion(String name) {
        super(name);
    }
    public String speak() {
        return "roar";
    }
}
