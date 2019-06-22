package io.zipcoder.polymorphism;

public class PetGenerator {

    public Pets createPet(String name, String type) {

        if(type.equalsIgnoreCase("cat")) {
            return new Cat(name);

        }
        else if(type.equalsIgnoreCase("dog")) {
            return new Dog(name);

        }
        else if(type.equalsIgnoreCase("lion")){
            return new Lion(name);
        }
        else {
            return new Pets(name);
        }
    }
}
